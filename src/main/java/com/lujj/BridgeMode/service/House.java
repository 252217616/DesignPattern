package com.lujj.BridgeMode.service;

public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产房子");
    }

    @Override
    public void beSelled() {
        System.out.println("卖房子");
    }
}
