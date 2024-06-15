package com.relationsBetweenObjects.dependency;

public class Main {

    public static void main(String[] args) {
        Course javaCourse = new Course("Java", 199.99);
        Class theClass = new Class();
        theClass.printInfo(javaCourse);

        Lab physicsLab = new Lab("Physics", "D2", 15);
        theClass.printInfo(physicsLab);
    }
}
