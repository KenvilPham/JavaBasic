package com.home.javabasic.day2;

import java.util.Scanner;

public class Fibonaxi {

    public static int fibonaxiNumber(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonaxiNumber(n-1) + fibonaxiNumber(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", fibonaxiNumber(i));
        }
        sc.close();
    }
}
