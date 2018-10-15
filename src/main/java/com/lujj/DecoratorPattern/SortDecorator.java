package com.lujj.DecoratorPattern;

import com.lujj.DecoratorPattern.decorator.Decorator;

public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }


    private void reportSort(){
        System.out.println("我的排名是：35名！");
    }

    @Override
    public void reprot() {
        super.reprot();
        this.reportSort();
    }
}
