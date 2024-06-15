package com.relationsBetweenObjects.association;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine("A-312", "34523523412123");
        Car car = new Car(engine);
        car.printEngineInfo();
    }
}

/*
Association is a deeper dependency relation between objects. Car class has an association relation with Engine class
because it has a declared field of type Engine.
                Car-----Straight Line with open Arrow----->Engine
 */
