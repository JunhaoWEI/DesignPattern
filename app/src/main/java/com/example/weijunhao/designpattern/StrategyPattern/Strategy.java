package com.example.weijunhao.designpattern.StrategyPattern;

import android.util.Log;

/**
 * Created by WEI JUNHAO on 2017/5/2.
 */

public abstract class Strategy {
    public abstract void show();
}

class StrategyA extends Strategy {

    @Override
    public void show() {
        Log.d("wjh", "show: 为春节准备的促销活动A");
    }
}

class StrategyB extends Strategy {

    @Override
    public void show() {
        Log.d("wjh", "show: 为中秋节准备的促销活动B");
    }
}

class StrategyC extends Strategy {

    @Override
    public void show() {
        Log.d("wjh", "show: 为圣诞节准备的促销活动C");
    }
}

class SalesMan {
    //持有抽象策略角色的引用
    private Strategy strategy;

    public SalesMan(String festival) {
        switch (festival) {
            case "A":
                strategy = new StrategyA();
                break;
            case "B":
                strategy = new StrategyB();
                break;
            case "C":
                strategy = new StrategyC();
                break;
            default:
                break;
        }
    }

    public void salesManShow() {
        strategy.show();
    }
}

class StrategyPattern {
    public static void main(String[] args) {
        SalesMan salesMan;

        salesMan = new SalesMan("A");
        salesMan.salesManShow();
    }
}
