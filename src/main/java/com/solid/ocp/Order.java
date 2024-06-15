package com.solid.ocp;

import java.util.Date;
import java.util.List;

public class Order {

    private final List<Item> items;
    private Shipping shipping;

    public Order(List<Item> items) {
        this.items = items;
    }

    public double getTotal() {
        return Math.round(items.stream().map(Item::getPrice).reduce(Double::sum).orElse(0.0));
    }

    public double getTotalWeight() {
        return Math.round(items.stream().map(Item::getWeight).reduce(Double::sum).orElse(0.0));
    }

    public void setShippingType(Shipping shipping) {
        this.shipping = shipping;
    }

    public double getShippingCost() {
        return shipping.getShippingCost(this);
    }

    public Date getShippingDate() {
        return shipping.getShippingDate();
    }
}
