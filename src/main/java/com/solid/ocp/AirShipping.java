package com.solid.ocp;

import java.util.Date;

public class AirShipping implements Shipping {
    @Override
    public double getShippingCost(Order order) {
        return Math.max(20, order.getTotalWeight() * 3);
    }

    @Override
    public Date getShippingDate() {
        int inTwoDays = 1000 * 60 * 60 * 24 * 2;
        return new Date(System.currentTimeMillis() + inTwoDays);
    }
}
