package com.example.weijunhao.designpattern.TemplateMethod;

import android.util.Log;

/**
 * Created by weijunhao on 2017/5/2.
 */

public abstract class Abstract {
    final void cookProcess() {
        this.pourOil();
        this.heatOil();
        this.pourVegetable();
        this.pourSauce();
        this.fry();
    }

    private void fry() {
        Log.d("wjh", "fry: 翻炒");
    }

    protected abstract void pourSauce();

    protected abstract void pourVegetable();


    private void heatOil() {
        Log.d("wjh", "heatOil: 热油");
    }

    private void pourOil() {
        Log.d("wjh", "pourOil: 倒油");
    }


}

class ConcreteClass1 extends Abstract {

    @Override
    protected void pourSauce() {

    }

    @Override
    protected void pourVegetable() {

    }
}

class ConcreteClass2 extends Abstract {

    @Override
    protected void pourSauce() {

    }

    @Override
    protected void pourVegetable() {

    }
}

class TemplateMethod {
    public static void main(String[] args) {
        ConcreteClass1 concreteClass1 = new ConcreteClass1();
        concreteClass1.cookProcess();

        ConcreteClass2 concreteClass2 = new ConcreteClass2();
        concreteClass1.cookProcess();
    }

}
