package com.designPrinciples.programToAnInterface.ex1;

public class Cat {

    private final String name;
    private int energy;

    public Cat(String name) {
        this.name = name;
        energy = 0;
    }

    public void eat(Food food) {
        energy += food.getNutrition();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                '}';
    }
}
