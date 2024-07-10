package com.designPatterns.behavioral.state;

public abstract class Book {

    protected final String name;

    protected Book(String name) {
        this.name = name;
    }

    abstract Book nextBook();

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
