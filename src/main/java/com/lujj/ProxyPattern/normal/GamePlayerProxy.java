package com.lujj.ProxyPattern.normal;

public class GamePlayerProxy implements IGamePlayer {
    private GamePlayer gamePlayer;

    public GamePlayerProxy(String name){
        this.gamePlayer = new GamePlayer(this,name);
    }

    @Override
    public void login(String user, String password) {
        this.doSomeThing();
        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.doSomeThing();
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.doSomeThing();
        this.gamePlayer.upgrade();
    }

    private void doSomeThing(){
        System.out.println("代理类干了点其他的事情！");
    }
}
