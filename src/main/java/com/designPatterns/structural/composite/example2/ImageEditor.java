package com.designPatterns.structural.composite.example2;

public class ImageEditor {

    public static void main(String[] args) {
        CompoundGraphic compoundGraphic1 = new CompoundGraphic();
        compoundGraphic1.add(new Dot(1, 3));
        compoundGraphic1.add(new Dot(2, 5));
        compoundGraphic1.add(new Circle(3, 4, 5));
        compoundGraphic1.add(new Sphere(1, 1, 5, 20));

        CompoundGraphic compoundGraphic2 = new CompoundGraphic();
        compoundGraphic2.add(new Dot(45, 4));

        compoundGraphic1.add(compoundGraphic2);

        compoundGraphic1.draw();
    }
}
