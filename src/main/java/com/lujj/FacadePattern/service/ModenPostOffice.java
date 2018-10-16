package com.lujj.FacadePattern.service;

public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcess();
    private Police letterPolice = new Police();

    public void sendLetter(String context,String address){
        //写信内容
        letterProcess.writeContext(context);
        //写信封
        letterProcess.fillEnvelope(address);
        //检查信件（用门面模式之后可以统一处理）
        letterPolice.checkLetter(letterProcess);
        //把信放到信封里
        letterProcess.letterInotoEnvelope();
        //邮递
        letterProcess.sendLetter();
    }
}
