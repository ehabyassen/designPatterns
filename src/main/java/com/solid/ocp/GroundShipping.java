package com.solid.ocp;

import java.util.Date;

public class GroundShipping implements Shipping {

    @Override
    public double getShippingCost(Order order) {
        if (order.getTotal() > 100) return 0;
        return Math.max(10, order.getTotalWeight() * 1.5);
    }

    @Override
    public Date getShippingDate() {
        int inFiveDays = 1000 * 60 * 60 * 24 * 5;
        return new Date(System.currentTimeMillis() + inFiveDays);
    }
}
