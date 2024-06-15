package com.relationsBetweenObjects.inheritance;

public class ClassA {

    private int a;
    protected int b;

    public ClassA(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
