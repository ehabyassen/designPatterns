package com.designPatterns.behavioral.strategy;

public class VolvoDisassembleStrategy implements DisassembleStrategy {

    @Override
    public void disassembleCar() {
        System.out.println("Disassembling a Volvo");
    }
}
