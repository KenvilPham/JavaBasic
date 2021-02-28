package com.home.javabasic.solidexample.singleresponsibilityprinciple.bad;

import com.home.javabasic.solidexample.singleresponsibilityprinciple.Connection;
import com.home.javabasic.solidexample.singleresponsibilityprinciple.Product;
import com.home.javabasic.solidexample.singleresponsibilityprinciple.User;

import java.util.List;

public class DBHelper {
    public Connection openConnection() {
        return null;
    };

    public void saveUser(User user) {};

    public List<Product> getProducts() {
        return null;
    };

    public void closeConnection() {};
}
