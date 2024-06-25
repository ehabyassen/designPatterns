package com.designPatterns.structural.composite.example2;

public class Sphere extends Circle {

    private final int volume;

    public Sphere(int x, int y, int radius, int volume) {
        super(x, y, radius);
        this.volume = volume;
    }

    @Override
    public void draw() {
        System.out.println("Drawing sphere at: " + getX() + ", " + getY() + " with radius: " +
                getRadius() + " with volume: " + volume + "...");
    }
}
