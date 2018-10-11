package com.lujj.PrototypeModel;

import com.lujj.PrototypeModel.bean.AdvTemplate;
import com.lujj.PrototypeModel.bean.Mail;

import java.util.Random;

/**
 * 原型模式，发送账单
 */
public class Client {
    //发送账单的数量
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        //模拟发送邮件
        int i=0;
        //把模板定义出来，这个是从数据库中获得
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("囧囧银行版权所有");
        while (i<MAX_COUNT){
            //为每封邮件不同的地方赋值（随机值代替）
            Mail cloneMail = mail.clone();//克隆 避免多线程不安全
            cloneMail.setAppellation(getRandString(5));
            cloneMail.setReceiver(getRandString(5)+"@"+getRandString(3)+".com");
            sendEmail(cloneMail);
            i++;
        }
    }

    public static String getRandString(int length){
        String strs = "abcdefghigklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<length;i++){
            sb.append(strs.charAt(new Random().nextInt(strs.length())));
        }
        return sb.toString();
    }

    public static void sendEmail (Mail mail){
        System.out.println("标题："+mail.getSubject()+"，收件人为："+mail.getReceiver()+"发送成功！");
    }
}
