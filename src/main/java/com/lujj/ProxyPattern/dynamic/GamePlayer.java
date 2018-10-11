package com.lujj.ProxyPattern.dynamic;

public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(String name){

        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println(user+"用户登录了。");
    }

    @Override
    public void killBoss() {
        System.out.println(name+"杀死boss了。");
    }

    @Override
    public void upgrade() {
        System.out.println(name+"升级了！");
    }
}
