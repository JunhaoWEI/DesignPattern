package com.example.weijunhao.designpattern.SimpleFactoryPattern;

/**
 * Created by WEI JUNHAO on 2017/5/2.
 */

public class Factory {
    public static Product Manufacture(String productName) {

        switch (productName) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            case "C":
                return new ProductC();
            default:
                return null;
        }
    }
}
