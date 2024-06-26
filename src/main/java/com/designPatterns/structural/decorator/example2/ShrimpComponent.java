package com.designPatterns.structural.decorator.example2;

public class ShrimpComponent extends PizzaComponent {

    private final PizzaComponent pizzaComponent;

    public ShrimpComponent(PizzaComponent pizzaComponent) {
        this.pizzaComponent = pizzaComponent;
    }

    @Override
    public double getCost() {
        return pizzaComponent.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return pizzaComponent.getDescription() + " with Shrimps";
    }
}
