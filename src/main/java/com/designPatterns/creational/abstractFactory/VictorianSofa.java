package com.designPatterns.creational.abstractFactory;

public class VictorianSofa extends Sofa {

    @Override
    public double getWeight() {
        return 45;
    }

    @Override
    public double getPrice() {
        return 14000;
    }

    @Override
    String getStyle() {
        return "Victorian Sofa";
    }
}
