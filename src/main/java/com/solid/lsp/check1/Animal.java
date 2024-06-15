package com.solid.lsp.check1;

public class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void breathe() {
        System.out.println(name + " is breathing...");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + "...");
    }

    public void walk() {
        System.out.println(name + " is walking...");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
