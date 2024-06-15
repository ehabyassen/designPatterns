package com.designPrinciples.compositionOverInheritance.solution;

public class Robot implements Driver {

    @Override
    public void navigate() {
        System.out.println("Navigating automatically as a robot...");
    }
}
