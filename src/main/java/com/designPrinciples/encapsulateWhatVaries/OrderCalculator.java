package com.designPrinciples.encapsulateWhatVaries;

public class OrderCalculator {

    public double calculateOrderTotal(Order order) {
        double total = 0;
        for(Item item : order.getItems()) {
            double itemPrice = item.getPrice() * item.getQuantity();
            total += itemPrice + itemPrice * getTaxRate(order.getCountry());
        }
        return total;
    }

    //tax rate is encapsulated on the method level
    private double getTaxRate(String country) {
        if (country.equals("US")) return 0.07;
        if (country.equals("DE")) return 0.2;
        else return 0;
    }
}
