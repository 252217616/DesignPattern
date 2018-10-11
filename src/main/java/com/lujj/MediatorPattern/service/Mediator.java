package com.lujj.MediatorPattern.service;

/**
 * 中介者
 */
public class Mediator extends AbstractMediator{
    @Override
    public void execute(String str, Object... objects) {
        if(str.equals("purchase.buy")){ //
            this.buySomething((Integer)objects[0]);
        }else if(str.equals("sale.sell")){ //
            this.sell((Integer)objects[0]);
        }else if(str.equals("sale.offsell")){ //
            this.offSell();
        }else if(str.equals("stock.clear")){ //
            this.clearStock();
        }
    }

    //采购
    private void buySomething(int number){
        //销售情况
        int saleStatus = super.sale.getSaleStatus();
        if(saleStatus>80){//销售良好
            System.out.println("销售良好");
        }else{ //销售状况不好
            System.out.println("销售不行，折半采购");
            number = number/2;
        }
        System.out.println("采购点东西："+number+"个！");
        super.stock.incrasc(number);
    }

    //销售
    private void sell (int number){
        if(super.stock.getStorckNumber()<number){
            //销售数量不够,通知采购
            super.purchase.buySomething(number);
        }
        System.out.println("销售一点东西："+number+"个");
        super.stock.decrease(number);
    }

    private void offSell(){
        System.out.println("折价销售所有库存"+super.stock.getStorckNumber()+"个");
    }

    //存货压力大，停止采购，加快销售
    private void clearStock(){
        System.out.println("需要清理库存数量为："+super.stock.getStorckNumber());
        //折价销售
        super.sale.offSale();
        //停止采购
        super.purchase.refuseBuySomething();
    }
}
