package ProxyPattern.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 该类对组装动态代理类进行封装，高层模块调用更加简洁清晰
 */
public class GamePlayDynamicProxy {

    public static <T> T newProxyInstance(IGamePlayer gamePlayer){
        ClassLoader classLoader = gamePlayer.getClass().getClassLoader();
        Class<?>[] interfaces = gamePlayer.getClass().getInterfaces();
        InvocationHandler handler = new GamePlayIH(gamePlayer);
        return (T) Proxy.newProxyInstance(classLoader,interfaces,handler);
    }

}
