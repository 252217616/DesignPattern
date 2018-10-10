package TemplatePattern;

/**
 * 汽车模型
 */
public abstract class CarModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    public void run (){
        //先发动汽车
        this.start();
        //引擎轰鸣
        this.engineBoom();
        //按喇叭
        this.alarm();
        //停车
        this.stop();
    }
}