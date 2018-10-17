package com.lujj.BridgeMode.service;

public abstract class Corp {

    private Product product;

    public Corp (Product product){
        this.product = product;
    }

    public void makeMoney(){
        //赚钱都是生产然后销售
        this.product.beProducted();
        this.product.beSelled();
    }
}
