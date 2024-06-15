package com.designPrinciples.programToAnInterface.ex2;

public class Main {

    public static void main(String[] args) {
        Company gameDevCompany = new GameDevCompany();
        gameDevCompany.operate();

        System.out.println("#".repeat(50));

        Company outsourcingCompany = new OutsourcingCompany();
        outsourcingCompany.operate();
    }
}
