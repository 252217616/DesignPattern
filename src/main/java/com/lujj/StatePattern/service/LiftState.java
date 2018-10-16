package com.lujj.StatePattern.service;

public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    //电梯开门动作
    public abstract void open();
    //电梯门关闭
    public abstract void close();
    //运行状态
    public abstract void run();
    //电梯停止
    public abstract void stop();
}
