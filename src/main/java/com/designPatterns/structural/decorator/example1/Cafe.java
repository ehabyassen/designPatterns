package com.designPatterns.structural.decorator.example1;

public class Cafe {

    public static void main(String[] args) {
        HouseBlend houseBlend = new HouseBlend();
        Beverage houseBlendWithSugar = new Sugar(houseBlend);
        Beverage houseBlendWithSugarWithMilk = new Milk(houseBlendWithSugar);

        System.out.println(houseBlend);
        System.out.println(houseBlendWithSugar);
        System.out.println(houseBlendWithSugarWithMilk);
    }
}
