package com.designPatterns.creational.factoryMethod;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Road delivery started...");
    }
}
