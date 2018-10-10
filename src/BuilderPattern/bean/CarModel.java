package BuilderPattern.bean;

import java.util.ArrayList;

/**
 * 汽车模型
 */
public abstract class CarModel {
    //设置组装顺序
    private ArrayList<String> sequence = new ArrayList<String>();
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    /**
     * 重要实现 不允许修改。
     */
    final public void run (){
        for(String str:sequence){
            switch (str) {
                case "start" :
                    this.start();
                    break;
                case "stop" :
                    this.stop();
                    break;
                case "alarm" :
                    this.alarm();
                    break;
                case "engine Boom" :
                    this.engineBoom();
                    break;
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }
}
