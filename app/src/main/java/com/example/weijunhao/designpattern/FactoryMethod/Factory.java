package com.example.weijunhao.designpattern.FactoryMethod;

import android.util.Log;

/**
 * Created by WEI JUNHAO on 2017/5/2.
 */

//抽象工厂类
abstract class Factory {
    public abstract Product Manufacture();
}

//抽象产品类
abstract class Product {
    public abstract void show();
}

//具体产品类A
class ProductA extends Product {

    @Override
    public void show() {
        Log.d("wjh", "生产出了产品A");
    }
}

//具体产品类B
class ProductB extends Product {

    @Override
    public void show() {
        Log.d("wjh", "生产出了产品B");
    }
}

//工厂A类，生产A类产品
class FactoryA extends Factory {

    @Override
    public Product Manufacture() {
        return new ProductA();
    }
}

//工厂B类，生产B类产品
class FactoryB extends Factory {

    @Override
    public Product Manufacture() {
        return new ProductB();
    }
}

//生产工作流程
class FactoryPattern {
    public static void main(String[] args) {
        //客户要产品A
        FactoryA factoryA = new FactoryA();
        factoryA.Manufacture().show();

        //客户要产品B
        FactoryB factoryB = new FactoryB();
        factoryB.Manufacture().show();
    }
}
