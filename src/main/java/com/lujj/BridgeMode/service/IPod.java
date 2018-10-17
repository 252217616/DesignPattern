package com.lujj.BridgeMode.service;

public class IPod extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产Ipod");
    }

    @Override
    public void beSelled() {
        System.out.println("卖Ipod");
    }
}
