package com.designPrinciples.compositionOverInheritance.solution;

public class Human implements Driver {

    @Override
    public void navigate() {
        System.out.println("Navigating manually as a human...");
    }
}
