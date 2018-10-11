package com.lujj.singleton;

public class Singleton {

    /**
     * 饿汉式，类创建时生成实例
     */
//    private static Singleton singleton = new Singleton();

    /**
     * 构造函数私有化，禁止对外new对象。
     */
    private Singleton(){

    }

    /**
     * 通过内部类特性来实现线程安全的 懒汉式
     * Java中静态内部类可以访问其外部类的成员属性和方法，
     * 同时，静态内部类只有当被调用的时候才开始首次被加载，
     * 利用此特性，可以实现懒汉式，在静态内部类中静态初始化外部类的单一实例即可
     */
    private static class SingletonBuilder {
        private static Singleton singleton = new Singleton();
    }

    /**
     * 获得实例方法（保证多线程唯一）
     * @return
     */
    public static Singleton getSingleton (){
        //懒汉式，使用该方法时创建对象 (线程不安全，加锁效率低)
//        if(singleton == null){
//            singleton = new Singleton();
//        }
//        return singleton;
        return SingletonBuilder.singleton;
    }

    /**
     * 其他方法尽量是static的
     */
    public static void doSomething (){
        System.out.println("我搞事情了。");
    }
}
