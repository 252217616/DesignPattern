package FactoryPattern.service;

import FactoryPattern.bean.Human;

public class HumanFactory extends AbstracHumanFactory {


    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        //定义一个人种
        Human human = null;
        try{
            human = (T) c.newInstance();
        }catch (Exception e){
            System.out.println("造人发生错误！");
            e.printStackTrace();
        }

        return (T) human;
    }
}
