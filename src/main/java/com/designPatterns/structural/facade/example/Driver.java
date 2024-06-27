package com.designPatterns.structural.facade.example;

public class Driver {

    private final Door door;
    private final Mirror mirror;
    private final Key key;
    private final Engine engine;

    public Driver(Door door, Mirror mirror, Key key, Engine engine) {
        this.door = door;
        this.mirror = mirror;
        this.key = key;
        this.engine = engine;
    }

    public void driveCar() {
        door.open();
        getIn();
        door.close();
        mirror.unfold();
        key.insert();
        engine.ignite();
    }

    public void getIn() {
        System.out.println("Getting into car...");
    }
}
