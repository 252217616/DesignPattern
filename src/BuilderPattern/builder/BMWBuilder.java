package BuilderPattern.builder;

import BuilderPattern.bean.BMWModel;
import BuilderPattern.bean.CarModel;

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
