package com.designPatterns.creational.prototype;

public class Rectangle extends Shape {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", color='" + getColor() + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
