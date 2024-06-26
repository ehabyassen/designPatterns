package com.designPatterns.structural.decorator.example1;

public class Milk extends AddOn {


    public Milk(Beverage beverage) {
        super("Milk", beverage);
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 2;
    }
}
