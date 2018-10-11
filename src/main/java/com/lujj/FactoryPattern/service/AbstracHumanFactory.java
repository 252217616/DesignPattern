package com.lujj.FactoryPattern.service;

import com.lujj.FactoryPattern.bean.Human;

public abstract class AbstracHumanFactory {

    public abstract <T extends Human> T createHuman (Class<T> c) ;
}
