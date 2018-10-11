package com.lujj.BuilderPattern.builder;

import com.lujj.BuilderPattern.bean.BMWModel;
import com.lujj.BuilderPattern.bean.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder{
    private BMWModel bmw = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCar() {
        return bmw;
    }
}
