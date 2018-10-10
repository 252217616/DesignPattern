package BuilderPattern.bean;

public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车开始启动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停车了");
    }

    @Override
    protected void alarm() {
        System.out.println("喇叭:bao ma bao ma");
    }

    @Override
    protected void engineBoom() {
        System.out.println("引擎：baobaobaobaobaobao!");
    }
}
