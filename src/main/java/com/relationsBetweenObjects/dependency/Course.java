package com.relationsBetweenObjects.dependency;

public class Course implements Teachable {

    private final String name;
    private final double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
