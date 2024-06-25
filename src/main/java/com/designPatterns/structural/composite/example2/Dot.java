package com.designPatterns.structural.composite.example2;

public class Dot implements Graphic {

    private final int x;
    private final int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving Dot to: " + x + ", " + y + "...");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Dot at: " + x + ", " + y + "...");
    }
}
