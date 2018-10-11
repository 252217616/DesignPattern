package com.lujj.FactoryPattern.bean;

/**
 * 白人
 */
public class WhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("白种人");
    }

    @Override
    public void talk() {
        System.out.println("白种人大部分来自欧洲！");
    }
}
