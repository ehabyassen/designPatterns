package com.relationsBetweenObjects.inheritance;

public class ClassB extends ClassA {

    public ClassB(int a, int b) {
        super(a, b);
    }

    public int calculateSum() {
        return getA() + getB();
    }
}
