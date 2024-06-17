package com.designPatterns.creational.prototype;

public class Circle extends Shape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", color='" + getColor() + '\'' +
                ", radius=" + radius +
                '}';
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
