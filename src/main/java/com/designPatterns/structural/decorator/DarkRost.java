package com.designPatterns.structural.decorator;

public class DarkRost extends Beverage {

    public DarkRost() {
        super("Dark Rost");
    }

    @Override
    public double getCost() {
        return 3.5;
    }
}
