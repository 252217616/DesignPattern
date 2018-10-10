package TemplatePattern;

/**
 * 悍马H1
 */
public class HummerH1 extends CarModel {
    @Override
    protected void start() {
        System.out.println("悍马h1开始启动");
    }

    @Override
    protected void stop() {
        System.out.println("停车了");
    }

    @Override
    protected void alarm() {
        System.out.println("喇叭:滴滴滴滴滴");
    }

    @Override
    protected void engineBoom() {
        System.out.println("引擎：轰轰轰轰轰轰！");
    }
}
