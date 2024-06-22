package com.designPatterns.structural.bridge.example1;

public abstract class Shape {

    private Material material;
    private Color color;

    protected Shape(Material material, Color color) {
        this.material = material;
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public Color getColor() {
        return color;
    }
}
