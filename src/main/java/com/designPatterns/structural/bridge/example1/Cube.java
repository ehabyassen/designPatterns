package com.designPatterns.structural.bridge.example1;

public class Cube extends Shape {

    protected Cube(Material material, Color color) {
        super(material, color);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "material=" + getMaterial() +
                ", color=" + getColor() +
                '}';
    }
}
