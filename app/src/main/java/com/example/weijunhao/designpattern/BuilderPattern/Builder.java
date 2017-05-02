package com.example.weijunhao.designpattern.BuilderPattern;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by weijunhao on 2017/5/2.
 */

public abstract class Builder {
    public abstract void BuildCPU();

    public abstract void BuildMainboard();

    public abstract void BuildHD();

    public abstract Computer getComputer();
}

class Director {
    public void Construct(Builder builder) {
        builder.BuildCPU();
        builder.BuildMainboard();
        builder.BuildHD();
    }
}

class ConcreteBuilder extends Builder {

    Computer computer = new Computer();

    @Override
    public void BuildCPU() {
        computer.add("CPU");
    }

    @Override
    public void BuildMainboard() {
        computer.add("主板");
    }

    @Override
    public void BuildHD() {
        computer.add("显示屏");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}

class Computer {

    List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        for (String part : parts) {

        }
    }

}

class BuilderPattern {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        director.Construct(builder);

        Computer computer = builder.getComputer();
        computer.show();
    }

}
