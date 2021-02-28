package com.home.javabasic.solidexample.openclosedprinciple.bad;

import com.home.javabasic.solidexample.openclosedprinciple.ShippingMethod;

public class Order {
    public long calculateShipping(ShippingMethod shippingMethod) {
        if (shippingMethod == GROUND) {
            // Calculate for ground shipping
        } else if (shippingMethod == AIR) {
            // Calculate for air shipping
        } else {
            // Default
        }
    }
}
