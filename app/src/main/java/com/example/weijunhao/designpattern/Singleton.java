package com.example.weijunhao.designpattern;

/**
 * Created by WEI JUNHAO on 2017/5/2.
 */

public class Singleton {
    //1.创建私有变量ourInstace(用以记录Singleton的唯一实例)
    //2.内部进行实例化
    private static final Singleton ourInstance = new Singleton();


    //4.定义共有方法提供该类的全局唯一访问点
    //5.外部通过调用getInstance()方法来返回唯一的实例
    public static Singleton getInstance() {
        return ourInstance;
    }

    //3.把类的构造方法私有化， 不让外部调用构造方法实例
    private Singleton() {
    }
}
