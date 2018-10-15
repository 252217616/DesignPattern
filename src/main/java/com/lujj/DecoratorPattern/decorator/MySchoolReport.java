package com.lujj.DecoratorPattern.decorator;

import com.lujj.DecoratorPattern.SchoolReport;

public class MySchoolReport implements SchoolReport {
    @Override
    public void reprot() {
        System.out.println("语文：60、数学：35、英语：55");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名："+name);
    }
}
