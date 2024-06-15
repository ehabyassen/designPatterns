package com.designPatterns.creational.abstractFactory;

public class ArabicSofa extends Sofa {

    @Override
    double getWeight() {
        return 60;
    }

    @Override
    double getPrice() {
        return 13000;
    }

    @Override
    String getStyle() {
        return "Arabic Sofa";
    }
}
