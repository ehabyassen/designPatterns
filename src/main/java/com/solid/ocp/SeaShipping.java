package com.solid.ocp;

import java.util.Date;

public class SeaShipping implements Shipping {
    @Override
    public double getShippingCost(Order order) {
        return Math.max(40, order.getTotalWeight() * 4);
    }

    @Override
    public Date getShippingDate() {
        int inTenDays = 1000 * 60 * 60 * 24 * 10;
        return new Date(System.currentTimeMillis() + inTenDays);
    }
}
