package com.relationsBetweenObjects.implementation;

public class Course implements Teachable {

    private final String name;

    public Course(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
