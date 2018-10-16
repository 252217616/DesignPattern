package com.lujj.StatePattern;

import com.lujj.StatePattern.service.ClosingState;
import com.lujj.StatePattern.service.Context;

/**
 * 状态模式
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.close();
        context.run();
        context.open();
        context.stop();
    }
}
