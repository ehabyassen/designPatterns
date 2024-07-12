package com.designPatterns.behavioral.visitor;

public class XMLExportVisitor implements Visitor {

    @Override
    public void visitDot(Dot dot) {
        System.out.println("Exporting Dot in XML format...");
    }

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Exporting Circle in XML format...");
    }

    @Override
    public void visitSquare(Square square) {
        System.out.println("Exporting Square in XML format...");
    }
}
