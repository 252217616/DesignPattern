package FactoryPattern.bean;

/**
 * 黑色人种
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑种人");
    }

    @Override
    public void talk() {
        System.out.println("黑种人大部分来自非洲！");
    }
}
