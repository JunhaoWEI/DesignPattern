package com.example.weijunhao.designpattern.AbstractFactory;


import android.util.Log;

/**
 * Created by WEI JUNHAO on 2017/5/2.
 */

public abstract class Factory {
    public abstract AbstractProduct ManufactureContainer();

    public abstract AbstractProduct ManufactureMould();
}

//创建抽象产品族类
abstract class AbstractProduct {
    public abstract void show();
}

//创建抽象产品类，容器产品抽象类
abstract class ContainerProduct extends AbstractProduct {
    @Override
    public abstract void show();
}

//创建抽象产品类，模具产品抽象类
abstract class MouldProduct extends AbstractProduct {
    @Override
    public abstract void show();
}

//创建具体产品类，容器产品A类
class ContainerProductA extends ContainerProduct {
    @Override
    public void show() {
        Log.d("wjh", "生产出了容器产品A");
    }
}

//创建具体产品类，容器产品B类
class ContainerProductB extends ContainerProduct {

    @Override
    public void show() {
        Log.d("wjh", "生产出了容器产品B");
    }
}

//创建具体产品类，模具产品A类
class MouldProductA extends MouldProduct {

    @Override
    public void show() {
        Log.d("wjh", "生产出了模具产品A");
    }
}

//创建具体产品类，模具产品B类
class MouldProductB extends MouldProduct {

    @Override
    public void show() {
        Log.d("wjh", "生产出了模具产品B");
    }
}

//创建具体工厂类  A厂  生产模具+容器
class FactoryA extends Factory {

    @Override
    public AbstractProduct ManufactureContainer() {
        return new ContainerProductA();
    }

    @Override
    public AbstractProduct ManufactureMould() {
        return new MouldProductA();
    }
}

//创建具体工厂类  B厂  生产模具+容器
class FactoryB extends Factory {

    @Override
    public AbstractProduct ManufactureContainer() {
        return new ContainerProductB();
    }

    @Override
    public AbstractProduct ManufactureMould() {
        return new MouldProductB();
    }
}

//生产工作流程
class AbstractFactoryPattern {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        FactoryB factoryB = new FactoryB();

        //A厂当客户需要容器产品A时
        factoryA.ManufactureContainer().show();
        //A厂当地客户需要模具产品A
        factoryA.ManufactureMould().show();

        //B厂当地客户需要容器产品B
        factoryB.ManufactureContainer().show();
        //B厂当地客户需要模具产品B
        factoryB.ManufactureMould().show();
    }
}