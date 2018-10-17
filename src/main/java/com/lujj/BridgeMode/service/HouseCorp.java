package com.lujj.BridgeMode.service;

public class HouseCorp extends Corp {


    public HouseCorp(House house) {
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房产公司赚大钱了！");
    }

}
