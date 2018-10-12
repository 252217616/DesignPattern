package com.lujj.ResponsibilityPattern;

import com.lujj.ResponsibilityPattern.handler.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

    public static void main(String[] args) {

        //随机挑选几个女性
        Random random = new Random();
        List<IWomen> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Women(random.nextInt(4), "要出去逛街"));
        }

        //获取链头
        Invoker invoker = new Invoker();
        Handler handler = invoker.HandleMessage();

        for (IWomen women : list) {
            handler.HandleMessage(women);
        }
    }

}
