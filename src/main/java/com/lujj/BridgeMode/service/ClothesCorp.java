package com.lujj.BridgeMode.service;

public class ClothesCorp extends Corp {

    public ClothesCorp(IPod iPod) {
        super(iPod);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱！");
    }

}
