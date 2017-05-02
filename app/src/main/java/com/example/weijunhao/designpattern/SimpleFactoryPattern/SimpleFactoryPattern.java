package com.example.weijunhao.designpattern.SimpleFactoryPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by WEI JUNHAO on 2017/5/2.
 */

public class SimpleFactoryPattern extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Factory factory = new Factory();
        //客户要产品A
        try {
//调用工厂类的静态方法 & 传入不同参数从而创建产品实例
            factory.Manufacture("A").show();
        } catch (NullPointerException e) {
            System.out.println("没有这一类产品");
        }

        //客户要产品B
        try {
            factory.Manufacture("B").show();
        } catch (NullPointerException e) {
            System.out.println("没有这一类产品");
        }

        //客户要产品C
        try {
            factory.Manufacture("C").show();
        } catch (NullPointerException e) {
            System.out.println("没有这一类产品");
        }

        //客户要产品D
        try {
            factory.Manufacture("D").show();
        } catch (NullPointerException e) {
            System.out.println("没有这一类产品");
        }
    }
}
