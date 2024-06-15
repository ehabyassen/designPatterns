package com.oopEssentials.classes;

public class User {

    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.printf("Hi, my name is %s. I am %d years old.%n", name, age);
    }
}
