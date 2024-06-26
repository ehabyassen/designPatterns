package com.designPatterns.structural.decorator.example2;

public class Main {

    public static void main(String[] args) {
        PizzaComponent basicPizza = new BasicPizza();
        System.out.println(basicPizza.getDescription());
        System.out.println(basicPizza.getCost());

        System.out.println("#".repeat(50));

        PizzaComponent pizzaWithShrimps = new ShrimpComponent(basicPizza);
        System.out.println(pizzaWithShrimps.getDescription());
        System.out.println(pizzaWithShrimps.getCost());

        System.out.println("#".repeat(50));

        PizzaComponent pizzaWithShrimpsWithSausage = new SausageComponent(pizzaWithShrimps);
        System.out.println(pizzaWithShrimpsWithSausage.getDescription());
        System.out.println(pizzaWithShrimpsWithSausage.getCost());
    }
}
