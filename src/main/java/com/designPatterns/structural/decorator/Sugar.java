package com.designPatterns.structural.decorator;

public class Sugar extends AddOn {

    public Sugar(Beverage beverage) {
        super("Sugar", beverage);
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 1.5;
    }
}
