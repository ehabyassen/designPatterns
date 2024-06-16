package com.designPatterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        House house = new House.Builder()
                .withWindows(4)
                .withDoors(2)
                .withRooms(4)
                .withSwimmingPool()
                .build();
        System.out.println(house);
    }
}
