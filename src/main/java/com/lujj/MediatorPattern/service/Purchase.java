package com.lujj.MediatorPattern.service;

/**
 * 采购管理
 */
public class Purchase extends AbstractColleague {


    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buySomething(int number){
        super.mediator.execute("purchase.buy",number);
    }

    public void refuseBuySomething(){
        System.out.println("拒绝采购");
    }
}
