package com.lujj.StrategyPattern.strategy;

public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("留孙夫人断后！");
    }
}
