package com.designPatterns.structural.bridge.example1;

public class Main {

    public static void main(String[] args) {
        Shape sphere = new Sphere(new Wood(), new Red());
        System.out.println(sphere);

        Shape cube = new Cube(new Metal(), new Blue());
        System.out.println(cube);
    }
}
