package com.designPatterns.behavioral.state;

public class Book1 extends Book {

    protected Book1() {
        super("Physics");
    }

    @Override
    Book nextBook() {
        return new Book2();
    }
}
