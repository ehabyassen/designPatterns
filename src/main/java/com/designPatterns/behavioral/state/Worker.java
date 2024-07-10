package com.designPatterns.behavioral.state;

public class Worker {

    private Book currentBook;

    public Worker() {
        this.currentBook = new Book1();
    }

    public Book getNextBook() {
        if (currentBook.nextBook() != null) {
            currentBook = currentBook.nextBook();
        }
        return currentBook;
    }

    public Book getCurrentBook() {
        return currentBook;
    }
}
