package com.designPatterns.structural.bridge.example1;

public abstract class Color {

    private final String color;

    protected Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }
}
