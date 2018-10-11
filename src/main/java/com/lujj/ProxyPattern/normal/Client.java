package com.lujj.ProxyPattern.normal;

/**
 * 普通代理--静态代理
 */
public class Client {
    public static void main(String[] args) {
        //定义代理类 屏蔽真实类
        IGamePlayer gamePlayer = new GamePlayerProxy("张三");
        gamePlayer.login("zhangsan","mima");
        gamePlayer.killBoss();
        gamePlayer.upgrade();

    }
}
