package com.designPatterns.behavioral.state;

public class Book3 extends Book {

    protected Book3() {
        super("Chemistry");
    }

    @Override
    Book nextBook() {
        return null;
    }
}
