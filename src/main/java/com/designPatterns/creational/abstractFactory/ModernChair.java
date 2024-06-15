package com.designPatterns.creational.abstractFactory;

public class ModernChair extends Chair {

    @Override
    public double getWeight() {
        return 14;
    }

    @Override
    public double getPrice() {
        return 3400;
    }

    @Override
    String getStyle() {
        return "Modern Chair";
    }
}
