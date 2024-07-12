package com.designPatterns.behavioral.visitor;

public class Circle implements Shape {

    @Override
    public void move(int x, int y) {
        System.out.println("Moving Circle to x, y...");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
