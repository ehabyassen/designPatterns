package com.relationsBetweenObjects.inheritance;

public class Main {

    public static void main(String[] args) {
        ClassB a = new ClassB(2, 3);
        System.out.println(a.calculateSum());
    }
}

/*
A child class can inherit/extend another super class and inherit its protected and public members.
It must provide a constructor that instantiate the super class using keyword super() in the first line in its
constructor.

                ClassB ---A straight line with an empty closed Arrow----|> ClassA
 */