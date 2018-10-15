package com.lujj.StrategyPattern;

import com.lujj.StrategyPattern.strategy.BackDoor;
import com.lujj.StrategyPattern.strategy.BlockEnemy;
import com.lujj.StrategyPattern.strategy.Context;
import com.lujj.StrategyPattern.strategy.GivenGreenLight;

public class Zhaoyun {
    //赵云出场了，根据诸葛亮的交代，依次3拆开妙计
    public static void main(String[] args) {
        Context context;
        System.out.println("刚到吴国拆开第一个！");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println();
        //刘备乐不思蜀了，开第二个
        System.out.println("刘备乐不思蜀了，开第二个锦囊");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println();
        System.out.println("孙权的小兵追来了，开第三个");
        context = new Context(new BlockEnemy());
        context.operate();

    }
}
