package com.lujj.ResponsibilityPattern.handler;

import com.lujj.ResponsibilityPattern.handler.Father;
import com.lujj.ResponsibilityPattern.handler.Handler;
import com.lujj.ResponsibilityPattern.handler.Husband;
import com.lujj.ResponsibilityPattern.handler.Son;

/**
 * 封装类，将链设置封装好
 */
public class Invoker {

    public Handler HandleMessage (){
        //定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        //设置请求顺序
        father.setNext(husband);
        husband.setNext(son);

        return father;
    }
}
