package com.designPatterns.creational.abstractFactory;

public class ArabicChair extends Chair {
    @Override
    double getWeight() {
        return 9;
    }

    @Override
    double getPrice() {
        return 1500;
    }

    @Override
    String getStyle() {
        return "Arabic Chair";
    }
}
