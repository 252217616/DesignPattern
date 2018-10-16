package com.lujj.BuilderPattern;

import com.lujj.BuilderPattern.bean.BMWModel;
import com.lujj.BuilderPattern.bean.BenzModel;
import com.lujj.BuilderPattern.builder.Director;

/**
 * 建造者模式
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        BenzModel aBenz = director.getAbenzModel();
        aBenz.run();
        BenzModel bBenz = director.getBbenzModel();
        bBenz.run();
        BMWModel aBmw = director.getABMWModel();
        aBmw.run();
        BMWModel bBmw = director.getBBMWModel();
        bBmw.run();
    }
}
