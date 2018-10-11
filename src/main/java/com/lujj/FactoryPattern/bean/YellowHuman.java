package com.lujj.FactoryPattern.bean;

public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄种人");
    }

    @Override
    public void talk() {
        System.out.println("黄种人大部分来自亚洲！");
    }
}
