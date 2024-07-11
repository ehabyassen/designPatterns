package com.designPatterns.behavioral.templateMethod;

public class RoundPizzaBaker extends PizzaBaker {

    @Override
    protected void definePizzaShape() {
        System.out.println("Baking Pizza in a round shape...");
    }
}
