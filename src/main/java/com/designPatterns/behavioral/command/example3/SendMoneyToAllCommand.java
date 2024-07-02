package com.designPatterns.behavioral.command.example3;

import java.util.List;

//Concrete Command 2
public class SendMoneyToAllCommand implements Command {

    private final List<Receiver> receivers;
    private final int money;

    public SendMoneyToAllCommand(List<Receiver> receivers, int money) {
        this.receivers = receivers;
        this.money = money;
    }

    @Override
    public void execute() {
        receivers.forEach(receiver -> receiver.receiveMoney(money));
    }
}
