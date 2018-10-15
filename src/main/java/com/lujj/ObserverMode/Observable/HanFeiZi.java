package com.lujj.ObserverMode.Observable;


import lombok.Data;

import java.util.Observable;

@Data
public class HanFeiZi extends Observable implements IHanFeiZi {


    @Override
    public void haveBreakfast() {
        System.out.println("韩非子开始吃饭了");
        super.setChanged();
        super.notifyObservers("韩非子开始吃饭了");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子开始娱乐了");
        super.setChanged();
        super.notifyObservers("韩非子开始娱乐了");
    }

}
