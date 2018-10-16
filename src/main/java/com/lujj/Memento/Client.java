package com.lujj.Memento;

import com.lujj.Memento.service.Boy;

/**
 * 备忘录模式+原型模式结合
 */
public class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();
        //初始化状态

        boy.setState("心情很棒！");
        System.out.println("男孩现在的状态："+boy.getState());
        boy.createMemento();
        boy.changeState();
        System.out.println("男孩现在的状态："+boy.getState());
        boy.restoreMemento();
        System.out.println("男孩现在的状态："+boy.getState());

    }
}
