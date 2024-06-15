package com.solid.ocp;

import java.util.Date;

public interface Shipping {

    double getShippingCost(Order order);

    Date getShippingDate();
}
