package com.designPatterns.creational.factoryMethod;

public abstract class Logistics {

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

    //Factory method
    public abstract Transport createTransport();
}
