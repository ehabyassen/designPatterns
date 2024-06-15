package com.relationsBetweenObjects.association;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void printEngineInfo() {
        System.out.println(engine);
    }
}
