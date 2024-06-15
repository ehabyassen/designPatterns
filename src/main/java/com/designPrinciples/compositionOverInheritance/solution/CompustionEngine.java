package com.designPrinciples.compositionOverInheritance.solution;

public class CompustionEngine implements Engine {

    @Override
    public void move() {
        System.out.println("Moving using gasoline...");
    }
}
