package BuilderPattern.builder;

import BuilderPattern.bean.BMWModel;
import BuilderPattern.bean.BenzModel;
import BuilderPattern.bean.CarModel;

import java.util.ArrayList;

/**
 * 导演类，封装建造者
 */
public class Director {
    private ArrayList<String> squence = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /**
     * ABenz先打喇叭再跑引擎不响
     * @return
     */
    public BenzModel getAbenzModel(){
        this.squence.clear();
        this.squence.add("alarm");
        this.squence.add("start");
        this.squence.add("stop");
        this.benzBuilder.setSequence(this.squence);
        return (BenzModel)this.benzBuilder.getCar();
    }
    /**
     * BBenz 没有喇叭
     * @return
     */
    public BenzModel getBbenzModel(){
        this.squence.clear();
        this.squence.add("start");
        this.squence.add("engine Boom");
        this.squence.add("stop");
        this.benzBuilder.setSequence(this.squence);
        return (BenzModel)this.benzBuilder.getCar();
    }
    /**
     * A宝马 只有启动结束 喇叭引擎都不响
     * @return
     */
    public BMWModel getABMWModel(){
        this.squence.clear();
        this.squence.add("start");
        this.squence.add("stop");
        this.bmwBuilder.setSequence(this.squence);
        return (BMWModel)this.bmwBuilder.getCar();
    }
    /**
     * B宝马正常
     * @return
     */
    public BMWModel getBBMWModel(){
        this.squence.clear();
        this.squence.add("start");
        this.squence.add("alarm");
        this.squence.add("engine Boom");
        this.squence.add("stop");
        this.bmwBuilder.setSequence(this.squence);
        return (BMWModel)this.bmwBuilder.getCar();
    }
}
