package com.designPatterns.behavioral.visitor;

public interface Visitor {

    void visitDot(Dot dot);

    void visitCircle(Circle circle);

    void visitSquare(Square square);
}
