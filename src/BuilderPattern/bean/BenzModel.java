package BuilderPattern.bean;

public class BenzModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("奔驰车开始启动");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停车了");
    }

    @Override
    protected void alarm() {
        System.out.println("喇叭:benz benz benz");
    }

    @Override
    protected void engineBoom() {
        System.out.println("引擎：zzzzzzzzzzzzzzzz!");
    }
}
