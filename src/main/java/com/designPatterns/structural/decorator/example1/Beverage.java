package com.designPatterns.structural.decorator.example1;

public abstract class Beverage {

    protected String description;

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double getCost();

    @Override
    public String toString() {
        return getDescription() + " - Cost: " + getCost();
    }
}
