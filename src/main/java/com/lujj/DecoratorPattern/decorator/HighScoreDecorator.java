package com.lujj.DecoratorPattern.decorator;

import com.lujj.DecoratorPattern.SchoolReport;

public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }


    private void highScore(){
        System.out.println("各科目最高分如下：");
        System.out.println("语文：65、数学：60、英语：72");
    }

    @Override
    public void reprot() {
        this.highScore();
        super.reprot();
    }

}
