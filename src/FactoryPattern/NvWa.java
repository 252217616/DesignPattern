package FactoryPattern;

import FactoryPattern.bean.BlackHuman;
import FactoryPattern.bean.Human;
import FactoryPattern.bean.WhiteHuman;
import FactoryPattern.bean.YellowHuman;
import FactoryPattern.service.AbstracHumanFactory;
import FactoryPattern.service.HumanFactory;

/**
 * 工厂模式--女娲造人
 */
public class NvWa {

    public static void main(String[] args) {
        //声明八卦炉
        AbstracHumanFactory YinYangLu = new HumanFactory();
        //第一次造人，火候不足
        System.out.println("第一次造人--白人");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        //第二次造人，火候太大
        System.out.println("第二次造人--黑人");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        //第三次造人，火候刚好
        System.out.println("第三次造人--黄人");
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

    }
}
