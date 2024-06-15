package com.designPatterns.behavioral.command.chef;

public class Main {

    public static void main(String[] args) {
        Chef chef = new Chef();
        Order cakeOrder = new Order(chef, "Cake");
        Order pastaOrder = new Order(chef, "Pasta");
        Waiter waiter = new Waiter();

        waiter.execute(cakeOrder);
        waiter.execute(pastaOrder);
    }
}
