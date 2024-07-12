package com.designPatterns.behavioral.visitor;

public class Dot implements Shape {

    @Override
    public void move(int x, int y) {
        System.out.println("Moving Dot to x, y...");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Dot...");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDot(this);
    }
}
