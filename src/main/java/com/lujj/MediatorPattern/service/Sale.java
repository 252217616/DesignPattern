package com.lujj.MediatorPattern.service;

import java.util.Random;

/**
 * 销售管理
 */
public class Sale extends AbstractColleague{

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void SellSomeThing(int number){
        super.mediator.execute("sale.sell", number);
    }

    public int getSaleStatus(){
        Random random = new Random();
        //随机表达 100-80畅销
        int saleStatus = random.nextInt(100);
        System.out.println("销售情况为："+saleStatus);
        return saleStatus;
    }

    public void offSale(){
        super.mediator.execute("sale.offsell");
    }
}
