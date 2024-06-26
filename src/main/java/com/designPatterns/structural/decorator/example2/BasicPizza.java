package com.designPatterns.structural.decorator.example2;

public class BasicPizza extends PizzaComponent {

    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Basic Pizza";
    }
}
