package com.designPatterns.creational.abstractFactory;

public abstract class Chair {

    abstract double getWeight();

    abstract double getPrice();

    abstract String getStyle();

    @Override
    public String toString() {
        return "Chair{" +
                "Weight=" + getWeight() +
                ", Price=" + getPrice() +
                ", Style=" + getStyle() +
                '}';
    }
}
