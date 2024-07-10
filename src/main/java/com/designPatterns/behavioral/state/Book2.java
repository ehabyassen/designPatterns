package com.designPatterns.behavioral.state;

public class Book2 extends Book {

    protected Book2() {
        super("Math");
    }

    @Override
    Book nextBook() {
        return new Book3();
    }
}
