package com.example.weijunhao.designpattern.ProxyPattern;

import android.util.Log;

/**
 * Created by weijunhao on 2017/5/2.
 */

public interface Subject {
    public void buyMac();
}

class RealSubject implements Subject {

    @Override
    public void buyMac() {
        Log.d("wjh", "buyMac: ");
    }
}

class Proxy implements Subject {

    @Override
    public void buyMac() {
        RealSubject realSubject = new RealSubject();
        realSubject.buyMac();
        this.wrapMac();
    }

    private void wrapMac() {
        Log.d("d", "wrapMac: 用盒子包装好的Mac");
    }
}

class ProxyPattern {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.buyMac();
    }
}

