package com.home.javabasic.day1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        String result;

        System.out.println("Input number: ");
        number = sc.nextInt();

        result = (number%2 == 0) ? "This is even number" : "This is odd number";

        System.out.println(result);

        sc.close();
    }
}
