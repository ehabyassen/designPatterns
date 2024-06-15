package com.relationsBetweenObjects.implementation;

public interface Teachable {

    void printInfo();
}

/*
An interface is a type with no state. Only Behaviour. So it contains methods declarations.
An interface is a contract and A class can implement the interface to provide concrete implementation for its methods.

                Class ---Dashed Line with Closed Empty Arrow---|> Interface

An interface can extend another interface and add new behaviour/methods to the contract and inherit the parent's
behaviour.

                InterfaceB ------Straight Line with closed empty Arrow-----|> InterfaceA
 */