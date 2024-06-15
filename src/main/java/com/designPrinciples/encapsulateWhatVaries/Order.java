package com.designPrinciples.encapsulateWhatVaries;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final String orderNumber;
    private final List<Item> items;
    private final String country;

    public Order(String orderNumber, String country) {
        this.orderNumber = orderNumber;
        this.country = country;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getCountry() {
        return country;
    }
}
