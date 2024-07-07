package com.designPatterns.behavioral.observer;

public class Subscriber {

    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println("Subscriber " + name + " received message " + message);
    }
}
