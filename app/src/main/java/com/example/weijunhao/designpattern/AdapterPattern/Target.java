package com.example.weijunhao.designpattern.AdapterPattern;

/**
 * Created by WEI JUNHAO on 2017/5/2.
 */

public interface Target {
    public void request();
}

class Adaptee {
    public void specificRequest() {
    }
}

class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        this.specificRequest();
    }
}

class AdapterPattern {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        adapter.request();
    }
}
