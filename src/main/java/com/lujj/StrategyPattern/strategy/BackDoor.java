package com.lujj.StrategyPattern.strategy;

public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老开后门");
    }
}
