package ProxyPattern.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {

    //被代理者
    private Class cls = null;
    //被代理对象
    private Object obj = null;

    //代理谁
    public GamePlayIH (Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(this.obj,args);
        if(method.getName().equals("login")){
            System.out.println("警告！有人在用我的账号登录！");
        }
        return result;
    }
}
