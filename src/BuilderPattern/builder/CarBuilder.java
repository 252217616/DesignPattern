package BuilderPattern.builder;

import BuilderPattern.bean.CarModel;

import java.util.ArrayList;

public abstract class CarBuilder {
    /**
     * 设置组装顺序
     * @param sequence
     */
    public abstract void setSequence(ArrayList<String> sequence);

    /**
     * 设置完毕顺序后，可以拿到汽车模型
     */
    public abstract CarModel getCar();
}
