package com.example.weijunhao.designpattern.AdapterPattern;

/**
 * Created by WEI JUNHAO on 2017/5/2.
 */

import android.util.Log;

/**
 * 例：小明买了台电视机
 * 冲突：插座蒂娜呀不兼容
 * 解决方案： 设置一个适配器讲插头输出220V转变成110V
 */
public interface Target {
    public void convert110V();
}

class PowerPort220V {
    public void output220V() {
    }
}

class Adapter220V extends PowerPort220V implements Target {

    @Override
    public void convert110V() {
        this.output220V();
    }
}

class ImportedMachine {
    public void work() {
        Log.d("wjh", "work: ");
    }
}

class AdapterPattern {
    public static void main(String[] args) {
        Target mAdapter220V = new Adapter220V();
        ImportedMachine importedMachine = new ImportedMachine();

        mAdapter220V.convert110V();
        importedMachine.work();
    }
}


