package com.designPatterns.structural.facade.example;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver(new Door(), new Mirror(), new Key(), new Engine());
        driver.driveCar();
    }
}
