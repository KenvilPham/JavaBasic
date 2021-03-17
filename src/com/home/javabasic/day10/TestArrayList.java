package com.home.javabasic.day10;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        ArrayList<Integer> mNumber = new ArrayList<>();

        cars.add("Volvo");
        cars.add("Audi");
        cars.add("Mazda");
        cars.add("BMW");

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                mNumber.add(i);
            }
        }

        System.out.println(mNumber);
    }
}
