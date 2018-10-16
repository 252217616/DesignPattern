package com.lujj.MediatorPattern;

import com.lujj.MediatorPattern.service.*;


/**
 * 中介者模式
 */
public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        System.out.println("采购人员采购");
        Purchase purchase = new Purchase(mediator);
        purchase.buySomething(100);
        System.out.println("销售");
        Sale sale = new Sale(mediator);
        sale.SellSomeThing(1);
        System.out.println("清理库存");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
