package com.designPatterns.behavioral.strategy;

public class ToyotaDisassembleStrategy implements DisassembleStrategy {

    @Override
    public void disassembleCar() {
        System.out.println("Disassembling a Toyota");
    }
}
