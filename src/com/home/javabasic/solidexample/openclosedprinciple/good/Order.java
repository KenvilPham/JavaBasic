package com.home.javabasic.solidexample.openclosedprinciple.good;

import com.home.javabasic.solidexample.openclosedprinciple.ShippingMethod;

public class Order {
    private Shipping shipping;
    public long calculateShipping(ShippingMethod shippingMethod) {
        // Find relevant Shipping implementation then call calculate() method
        return 0;
    }
}
