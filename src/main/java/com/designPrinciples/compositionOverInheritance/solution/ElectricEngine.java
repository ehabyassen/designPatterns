package com.designPrinciples.compositionOverInheritance.solution;

public class ElectricEngine implements Engine {

    @Override
    public void move() {
        System.out.println("Moving using electricity...");
    }
}
