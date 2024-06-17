package com.designPatterns.creational.prototype;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setX(0);
        circle.setY(0);
        circle.setColor("Red");

        Shape clone = circle.clone();

        System.out.println(circle + " #" + Integer.toHexString(circle.hashCode()));
        System.out.println(clone + " #" + Integer.toHexString(clone.hashCode()));

        System.out.println("#".repeat(50));

        clone.setColor("Yellow");

        System.out.println(circle + " #" + Integer.toHexString(circle.hashCode()));
        System.out.println(clone + " #" + Integer.toHexString(clone.hashCode()));
    }
}
