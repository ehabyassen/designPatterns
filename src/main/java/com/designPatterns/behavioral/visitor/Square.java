package com.designPatterns.behavioral.visitor;

public class Square implements Shape {

    @Override
    public void move(int x, int y) {
        System.out.println("Moving Square to x, y...");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square...");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSquare(this);
    }
}
