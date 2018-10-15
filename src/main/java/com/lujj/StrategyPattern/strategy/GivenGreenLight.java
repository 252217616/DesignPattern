package com.lujj.StrategyPattern.strategy;

public class GivenGreenLight implements IStrategy {


    @Override
    public void operate() {
        System.out.println("找吴国太开绿灯！");
    }
}
