package com.designPatterns.behavioral.templateMethod;

public class Client {

    public static void main(String[] args) {
        PizzaBaker baker = new SquarePizzaBaker();
        baker.makePizza();

        baker = new RoundPizzaBaker();
        baker.makePizza();
    }
}
