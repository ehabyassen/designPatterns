package com.designPatterns.structural.composite.example2;

public class Circle extends Dot {

    private final int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle at: " + getX() + ", " + getY() + " with radius: " + radius + "...");
    }
}
