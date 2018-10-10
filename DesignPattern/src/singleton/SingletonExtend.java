package singleton;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 产生固定的实例数量
 */
public class SingletonExtend {

    private SingletonExtend (){

    }
    //定义最多能产生的实例数量
    private static int maxNumOfSingletonExtend = 2;
    //储存对象容器(保证线程安全)
    private static Map<String,SingletonExtend> map = new ConcurrentHashMap<>();
    //产生所有对象
    static {
        for(int i = 0;i<maxNumOfSingletonExtend;i++){
            map.put("对象"+i,new SingletonExtend());
        }
    }
    //当前对象名称
    private static String name = "";

    //随机获取一个对象
    public static SingletonExtend getInstance(){
        Random random = new Random();
        name = "对象"+random.nextInt(maxNumOfSingletonExtend);
        return map.get(name);
    }

    //对象干事情
    public static void doSomething (){
        System.out.println(name+" 在搞事情！");
    }
}
