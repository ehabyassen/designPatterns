package com.designPrinciples.encapsulateWhatVaries;

public class Main {

    public static void main(String[] args) {
        Item item1 = new Item("Toy", 12.99, 3);
        Item item2 = new Item("Ruler", 4.99, 1);
        Item item3 = new Item("Cup", 8.99, 4);

        Order order = new Order("2323434", "DE");
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);

        OrderCalculator orderCalculator = new OrderCalculator();

        double orderTotal = orderCalculator.calculateOrderTotal(order);

        System.out.println("Order Total:" + orderTotal);
    }
}
