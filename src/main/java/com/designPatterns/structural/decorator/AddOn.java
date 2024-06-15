package com.designPatterns.structural.decorator;

public abstract class AddOn extends Beverage {

    protected Beverage beverage;

    public AddOn(String description, Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " with " + description;
    }
}
