package com.designPatterns.creational.abstractFactory;

public class VictorianChair extends Chair {

    @Override
    public double getWeight() {
        return 18;
    }

    @Override
    public double getPrice() {
        return 2499;
    }

    @Override
    String getStyle() {
        return "Victorian Chair";
    }
}
