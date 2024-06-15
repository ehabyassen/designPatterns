package com.designPatterns.creational.abstractFactory;

public abstract class Sofa {

    abstract double getWeight();

    abstract double getPrice();

    abstract String getStyle();

    @Override
    public String toString() {
        return "Sofa{" +
                "Weight=" + getWeight() +
                ", Price=" + getPrice() +
                ", Style=" + getStyle() +
                '}';
    }
}
