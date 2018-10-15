package com.lujj.StrategyPattern.strategy;

/**
 * 封装类--锦囊
 */
public class Context implements IStrategy {

    private IStrategy strategy;

    public Context (IStrategy strategy){
        this.strategy = strategy;
    }

    @Override
    public void operate() {
        strategy.operate();
    }
}
