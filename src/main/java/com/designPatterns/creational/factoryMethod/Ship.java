package com.designPatterns.creational.factoryMethod;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Sea delivery started...");
    }
}
