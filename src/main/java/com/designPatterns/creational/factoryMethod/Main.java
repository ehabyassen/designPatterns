package com.designPatterns.creational.factoryMethod;

public class Main {

    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();

        logistics = new SeaLogistics();
        logistics.planDelivery();

        logistics = new AirLogistics();
        logistics.planDelivery();
    }
}
