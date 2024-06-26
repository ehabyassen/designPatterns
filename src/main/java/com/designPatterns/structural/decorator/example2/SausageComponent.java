package com.designPatterns.structural.decorator.example2;

public class SausageComponent extends PizzaComponent {

    private final PizzaComponent pizzaComponent;

    public SausageComponent(PizzaComponent pizzaComponent) {
        this.pizzaComponent = pizzaComponent;
    }

    @Override
    public double getCost() {
        return pizzaComponent.getCost() + 8;
    }

    @Override
    public String getDescription() {
        return pizzaComponent.getDescription() + " with Sausage";
    }
}
