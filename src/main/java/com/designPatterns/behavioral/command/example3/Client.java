package com.designPatterns.behavioral.command.example3;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        System.out.println("Case 1: ");
        Receiver john = new Receiver("John");
        Command sendMoneyCommand = new SendMoneyCommand(john, 500);
        Invoker invoker = new Invoker();
        invoker.execute(sendMoneyCommand);

        System.out.println("#".repeat(50));

        System.out.println("Case 2: ");
        Receiver mark = new Receiver("Mark");
        Receiver bruno = new Receiver("Bruno");
        Command sendMoneyToAllCommand = new SendMoneyToAllCommand(List.of(mark, bruno), 300);
        invoker.execute(sendMoneyToAllCommand);
    }
}
