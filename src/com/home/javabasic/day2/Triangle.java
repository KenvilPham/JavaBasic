package com.home.javabasic.day2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhap vao 3 canh cua 1 tam giac, cac canh phai > 0.");

        do {
            System.out.println("Nhap vao canh a: ");
            a = sc.nextInt();
        } while (a <= 0);

        do {
            System.out.println("Nhap vao canh b: ");
            b = sc.nextInt();
        } while (b <= 0);

        do {
            System.out.println("Nhap vao canh c: ");
            c = sc.nextInt();
        } while (c <= 0);

        int temp;

        if (a >= b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a >= c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b >= c) {
            temp = b;
            b = c;
            c = temp;
        }

        if ((a + b) > c) {
            System.out.println("Cac so da nhap la 3 canh cua 1 tam giac.");
        } else {
            System.out.println("Cac so da nhap khong phai la 3 canh cua 1 tam giac.");
        }

        sc.close();
    }
}
