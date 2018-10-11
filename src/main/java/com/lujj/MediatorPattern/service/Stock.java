package com.lujj.MediatorPattern.service;

/**
 * 存货管理
 */
public class Stock extends AbstractColleague{

    public static int NUMBER = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    public void incrasc(int number){
        NUMBER+= number;
        System.out.println("库存数量为："+NUMBER);
    }

    public void decrease(int number){
        NUMBER -= number;
        System.out.println("库存数量为："+NUMBER);
    }

    public int getStorckNumber(){
        return NUMBER;
    }

    //存货压力大，停止采购，加快销售
    public void clearStock(){
        super.mediator.execute("stock.clear");

    }

}
