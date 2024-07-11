package com.designPatterns.behavioral.templateMethod;

public class SquarePizzaBaker extends PizzaBaker {

    @Override
    protected void definePizzaShape() {
        System.out.println("Baking Pizza in a square shape...");
    }
}
