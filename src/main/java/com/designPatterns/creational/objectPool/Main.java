package com.designPatterns.creational.objectPool;

public class Main {

    public static void main(String[] args) {
        ObjectPool<Car> pool = new ObjectPool<>(50, Car.class);
        Car c1 = pool.getObject();
        System.out.println(c1);
        System.out.println("Size: " + pool.getSize());

        Car c2 = pool.getObject();
        System.out.println(c2);
        System.out.println("Size: " + pool.getSize());

        Car c3 = pool.getObject();
        System.out.println(c3);
        System.out.println("Size: " + pool.getSize());

        pool.returnObject(c1);
        System.out.println("Size: " + pool.getSize());

        pool.returnObject(c2);
        System.out.println("Size: " + pool.getSize());

        pool.returnObject(c3);
        System.out.println("Size: " + pool.getSize());
    }
}
