package com.lujj.FacadePattern.service;

/**
 * 检查信件
 */
public class Police {
    //检查信件，检查完毕后盖上戳
    public void checkLetter (ILetterProcess letterProcess){
        System.out.println(letterProcess+"信件已经检查过了");
    }
}
