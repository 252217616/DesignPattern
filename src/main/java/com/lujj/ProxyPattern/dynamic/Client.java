package com.lujj.ProxyPattern.dynamic;

/**
 * 动态代理
 */
public class Client {
    public static void main(String[] args) {
        //一个玩家
        IGamePlayer player = new GamePlayer("张三");
        //动态产生一个代理者
        IGamePlayer proxy = GamePlayDynamicProxy.newProxyInstance(player);
        proxy.login("zhangsan","mima");
        proxy.killBoss();
        proxy.upgrade();

    }
}
