package com.designPatterns.structural.composite.abstractExample;

public class Leaf implements Component {

    @Override
    public void execute() {
        System.out.println("Leaf does some work...");
    }
}
