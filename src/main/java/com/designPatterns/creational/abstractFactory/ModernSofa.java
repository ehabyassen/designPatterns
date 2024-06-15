package com.designPatterns.creational.abstractFactory;

public class ModernSofa extends Sofa {

    @Override
    public double getWeight() {
        return 35;
    }

    @Override
    public double getPrice() {
        return 12000;
    }

    @Override
    String getStyle() {
        return "Modern Sofa";
    }
}
