package com.lujj.ObserverMode;

import com.lujj.ObserverMode.Observable.HanFeiZi;
import com.lujj.ObserverMode.Observer.LiSi;
import com.lujj.ObserverMode.Observer.LuSi;
import com.lujj.ObserverMode.Observer.WangSi;

import java.util.Observer;

/**
 * 观察者模式
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        //定义所有观察者
        Observer lisi = new LiSi();
        Observer wangsi= new WangSi();
        Observer lusi = new LuSi();

        HanFeiZi hanfeizi = new HanFeiZi();
        hanfeizi.addObserver(lisi);
        hanfeizi.addObserver(wangsi);
        hanfeizi.addObserver(lusi);

        hanfeizi.haveFun();
        hanfeizi.haveBreakfast();
    }
}
