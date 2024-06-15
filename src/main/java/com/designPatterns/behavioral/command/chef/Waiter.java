package com.designPatterns.behavioral.command.chef;

//Invoker
public class Waiter {

    public void execute(Order order) {
        order.execute();
    }
}
