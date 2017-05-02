package com.example.weijunhao.designpattern.FacadePattern;

/**
 * Created by weijunhao on 2017/5/2.
 */

public class SubSystemLight {
    public void on() {
    }

    public void off() {
    }

}

class SubSystemTelevision {
    public void on() {
    }

    public void off() {
    }
}

class SubSystemAirCondition {
    public void on() {
    }

    public void off() {
    }
}


class Facade {
    SubSystemLight light;
    SubSystemTelevision television;
    SubSystemAirCondition airCondition;

    public Facade(SubSystemLight light, SubSystemTelevision television, SubSystemAirCondition airCondition) {
        this.light = light;
        this.television = television;
        this.airCondition = airCondition;
    }

    public void on() {
        light.on();
        television.on();
        airCondition.on();
    }

    public void off() {
        light.off();
        television.off();
        airCondition.off();
    }

}

class FacadePattern{
    public static void main(String[] args) {
        Facade facade = new Facade(new SubSystemLight(), new SubSystemTelevision(),
                new SubSystemAirCondition());
        facade.on();
        facade.off();
    }
}
