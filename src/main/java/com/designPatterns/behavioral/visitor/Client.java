package com.designPatterns.behavioral.visitor;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        Visitor visitor = new XMLExportVisitor();

        Dot dot = new Dot();
        Circle circle = new Circle();
        Square square = new Square();

        List<Shape> shapes = List.of(dot, circle, square);

        shapes.forEach(shape -> shape.accept(visitor));
    }
}
