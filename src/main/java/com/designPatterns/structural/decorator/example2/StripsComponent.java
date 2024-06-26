package com.designPatterns.structural.decorator.example2;

public class StripsComponent extends PizzaComponent {

    private final PizzaComponent pizzaComponent;

    public StripsComponent(PizzaComponent pizzaComponent) {
        this.pizzaComponent = pizzaComponent;
    }

    @Override
    public double getCost() {
        return pizzaComponent.getCost() + 6;
    }

    @Override
    public String getDescription() {
        return pizzaComponent.getDescription() + " with Strips";
    }
}
