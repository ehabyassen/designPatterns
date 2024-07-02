package com.designPatterns.behavioral.command.example3;

//Concrete Command 1
public class SendMoneyCommand implements Command {

    private final Receiver receiver;
    private final int money;

    public SendMoneyCommand(Receiver receiver, int money) {
        this.receiver = receiver;
        this.money = money;
    }

    @Override
    public void execute() {
        receiver.receiveMoney(money);
    }
}
