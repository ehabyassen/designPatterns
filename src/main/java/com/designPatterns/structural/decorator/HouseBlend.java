package com.designPatterns.structural.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        super("House Blend");
    }

    @Override
    public double getCost() {
        return 2.8;
    }
}
