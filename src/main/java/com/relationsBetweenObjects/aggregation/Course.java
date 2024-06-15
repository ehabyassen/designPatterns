package com.relationsBetweenObjects.aggregation;

public class Course {

    private String name;
    private TextBook textBook;

    public Course(String name, TextBook textBook) {
        this.name = name;
        this.textBook = textBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TextBook getTextBook() {
        return textBook;
    }

    public void setTextBook(TextBook textBook) {
        this.textBook = textBook;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", textBook=" + textBook +
                '}';
    }
}
