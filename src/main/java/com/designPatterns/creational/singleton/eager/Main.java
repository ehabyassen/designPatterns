package com.designPatterns.creational.singleton.eager;

public class Main {

    public static void main(String[] args) {
        /*
         * drawback: an object is statically instantiated during class loading even
         * if the class is never used. to fix this, use lazy instantiation.
         */

        EagerSingleton instance = EagerSingleton.getInstance();
    }
}
