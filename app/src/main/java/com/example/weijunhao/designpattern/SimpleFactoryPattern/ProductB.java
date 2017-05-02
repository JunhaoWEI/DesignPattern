package com.example.weijunhao.designpattern.SimpleFactoryPattern;

import android.util.Log;

/**
 * Created by WEI JUNHAO on 2017/5/2.
 */

public class ProductB extends Product {
    private static final String TAG = "wjh";

    @Override
    public void show() {
        Log.d(TAG, "生产出了产品B");
    }
}
