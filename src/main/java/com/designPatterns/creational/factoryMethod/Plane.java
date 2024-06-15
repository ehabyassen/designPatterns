package com.designPatterns.creational.factoryMethod;

public class Plane implements Transport {

    @Override
    public void deliver() {
        System.out.println("Air delivery started...");
    }
}
