package com.designPatterns.structural.composite.abstractExample;

public class Main {

    public static void main(String[] args) {
        Composite composite = new Composite();
        composite.add(new Leaf());
        composite.add(new Leaf());
        composite.add(new Leaf());

        composite.execute();
    }
}
