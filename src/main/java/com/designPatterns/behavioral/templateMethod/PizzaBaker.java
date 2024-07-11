package com.designPatterns.behavioral.templateMethod;

public abstract class PizzaBaker {

    private void bakePizza() {
        System.out.println("Baking Pizza...");
    }

    protected abstract void definePizzaShape();

    private void putAddons() {
        System.out.println("Putting Addons on Pizza...");
    }

    private void heatPizza() {
        System.out.println("Heating Pizza...");
    }

    public void makePizza() {
        bakePizza();
        definePizzaShape();
        putAddons();
        heatPizza();
    }
}
