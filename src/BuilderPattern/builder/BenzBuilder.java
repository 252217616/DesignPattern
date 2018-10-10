package BuilderPattern.builder;

import BuilderPattern.bean.BenzModel;
import BuilderPattern.bean.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder{
    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        benz.setSequence(sequence);
    }

    @Override
    public CarModel getCar() {
        return benz;
    }
}
