package com.designPatterns.creational.abstractFactory;

public class ArabicFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ArabicChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArabicSofa();
    }
}
