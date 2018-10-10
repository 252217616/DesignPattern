package singleton;

/**
 * 单例模式
 */
public class Client {
    public static void main(String[] args) {
        //普通单例模式
        Singleton.doSomething();
        //有上限的单例模式
        for(int i = 0; i<6; i++){
            SingletonExtend singleton = SingletonExtend.getInstance();
            singleton.doSomething();
        }
    }
}
