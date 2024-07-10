package com.designPatterns.behavioral.strategy;

public class BmwDisassembleStrategy implements DisassembleStrategy {

    @Override
    public void disassembleCar() {
        System.out.println("Disassembling a BMW");
    }
}
