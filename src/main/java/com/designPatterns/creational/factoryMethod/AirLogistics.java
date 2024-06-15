package com.designPatterns.creational.factoryMethod;

public class AirLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
