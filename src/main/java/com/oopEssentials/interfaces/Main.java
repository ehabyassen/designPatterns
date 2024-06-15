package com.oopEssentials.interfaces;

public class Main {

    public static void main(String[] args) {
        TaxCalculator calculator = new SubTaxCalculator2019();
        calculator.calculateTax();
    }
}
