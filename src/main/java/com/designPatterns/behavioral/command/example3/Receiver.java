package com.designPatterns.behavioral.command.example3;

public class Receiver {

    private final String name;

    public Receiver(String name) {
        this.name = name;
    }

    public void receiveMoney(int money) {
        System.out.println(name + " received " + money + "$");
    }
}
