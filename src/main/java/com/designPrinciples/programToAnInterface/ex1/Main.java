package com.designPrinciples.programToAnInterface.ex1;

public class Main {

    public static void main(String[] args) {
        Cat lolo = new Cat("Lolo");
        Food sausage = new Sausage();
        Food dryFood = new DryFood();

        lolo.eat(sausage);
        lolo.eat(dryFood);

        System.out.println(lolo);
    }
}
