package com.relationsBetweenObjects.dependency;

public class Class {

    public void printInfo(Teachable teachable) {
        teachable.printInfo();
    }
}


/*
Dependency Relation: ClassA depends on ClassB. It means ClassA has a method or a constructor that accepts a parameter
of type ClassB. Any changes in ClassB leads to changes in ClassA. If ClassB was modified, ClassA must recompile.

                ClassA ---Dashed Line and Open Arrow---> ClassB

To break this dependency, We can introduce an interface, make ClassA depend on that interface and make ClassB implement
that interface. Concrete implementation in ClassB can change without affecting ClassA.
 */