package com.example.weijunhao.designpattern;

import android.util.Log;

/**
 * Created by WEI JUNHAO on 2017/5/2.
 */

//仓库类
public class StoreHouse {

    private int quantity = 100;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private static StoreHouse storeHouse = new StoreHouse();

    public static StoreHouse getInstance() {
        return storeHouse;
    }

    private StoreHouse() {

    }
}

//搬货工类
class Carrier {
    public StoreHouse mStoreHouse;

    public Carrier(StoreHouse storeHouse) {
        mStoreHouse = storeHouse;
    }

    public void moveIn(int i) {
        mStoreHouse.setQuantity(mStoreHouse.getQuantity() + i);
    }

    public void moveOut(int i) {
        mStoreHouse.setQuantity(mStoreHouse.getQuantity() - i);
    }
}

class SinglePattern {
    public static void main(String[] args) {
        StoreHouse storeHouse1 = StoreHouse.getInstance();
        StoreHouse storeHouse2 = StoreHouse.getInstance();

        Carrier carrier1 = new Carrier(storeHouse1);
        Carrier carrier2 = new Carrier(storeHouse2);

        carrier1.moveIn(30);
        carrier2.moveOut(50);
    }
}
