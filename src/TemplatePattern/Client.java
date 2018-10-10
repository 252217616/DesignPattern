package TemplatePattern;

public class Client {
    public static void main(String[] args) {
        CarModel hummer = new HummerH1();
        /**
         * 扩展控制是否响喇叭
         */
        ((HummerH1) hummer).setAlarm(false);
        hummer.run();
    }
}
