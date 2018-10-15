package com.lujj.ObserverMode.Observer;

import java.util.Observable;
import java.util.Observer;

public class WangSi implements Observer {

    private void repoetToQinShiHuang(String context) {
        System.out.println("报告：韩非子有活动了----->"+context);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("王斯：观察到韩非子活动，开始向老板汇报。。");
        this.repoetToQinShiHuang(arg.toString());
        System.out.println("汇报完毕");
    }
}
