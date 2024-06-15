package com.relationsBetweenObjects.composition;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Department> departments = List.of(new Department("Phsycology", "A01"),
                new Department("Physics", "A03"));
        University helwanUniversity = new University("Helwan", departments);
        System.out.println(helwanUniversity);
    }
}

/*
Composition relation implies a parent-child relationship.
Child object cannot exist without the parent object. They have the same life cycle.

                Parent<->-----Straight line with black diamond------Child
*/