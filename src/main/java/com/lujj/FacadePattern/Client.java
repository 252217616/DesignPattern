package com.lujj.FacadePattern;

import com.lujj.FacadePattern.service.ModenPostOffice;

/**
 * 门面模式
 */
public class Client {
    public static void main(String[] args) {
        //创建一个处理信件的过程
        ModenPostOffice moden = new ModenPostOffice();
        moden.sendLetter("今天天气不错","北京市");

    }
}
