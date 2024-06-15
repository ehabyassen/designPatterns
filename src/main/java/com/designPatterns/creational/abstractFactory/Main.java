package com.designPatterns.creational.abstractFactory;

public class Main {

    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        Chair chair = furnitureFactory.createChair();
        System.out.println(chair);

        furnitureFactory = new VictorianFurnitureFactory();
        Sofa sofa = furnitureFactory.createSofa();
        System.out.println(sofa);

        furnitureFactory = new ArabicFurnitureFactory();
        Chair chair2 = furnitureFactory.createChair();
        System.out.println(chair2);
    }
}
