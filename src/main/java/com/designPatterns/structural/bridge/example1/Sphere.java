package com.designPatterns.structural.bridge.example1;

public class Sphere extends Shape {

    protected Sphere(Material material, Color color) {
        super(material, color);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "material=" + getMaterial() +
                ", color=" + getColor() +
                '}';
    }
}
