package com.solid.ocp;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Item> items = List.of(new Item("Ruler", 0.3, 4.5),
                new Item("Toy", 8.5, 9.5),
                new Item("Cup", 1.25, 6.99));

        Order order = new Order(items);

        order.setShippingType(new GroundShipping());
        System.out.println(order.getTotal() + ", " + order.getTotalWeight() + ", " + order.getShippingCost() + ", " +
                order.getShippingDate());

        order.setShippingType(new AirShipping());
        System.out.println(order.getTotal() + ", " + order.getTotalWeight() + ", " + order.getShippingCost() + ", " +
                order.getShippingDate());

        order.setShippingType(new SeaShipping());
        System.out.println(order.getTotal() + ", " + order.getTotalWeight() + ", " + order.getShippingCost() + ", " +
                order.getShippingDate());
    }
}
