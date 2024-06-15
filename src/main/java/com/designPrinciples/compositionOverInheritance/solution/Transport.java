package com.designPrinciples.compositionOverInheritance.solution;

public class Transport {

    private final Driver driver;
    private final Engine engine;

    public Transport(Driver driver, Engine engine) {
        this.driver = driver;
        this.engine = engine;
    }

    public void deliver(String destination, String cargo) {
        System.out.println("Deliveing " + cargo + " to " + destination);
        driver.navigate();
        engine.move();
    }
}
