package com.designPatterns.behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        DisassembleStrategy strategy = engineer.getDisassembleStrategy(Car.Volvo);
        strategy.disassembleCar();
    }
}
