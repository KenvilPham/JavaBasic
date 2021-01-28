package com.home.javabasic.day2;

import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n: ");
        int n = sc.nextInt();

        int tichGiaiThua= 1;
        for (int i = 1; i <= n; i++){
            tichGiaiThua *= i;
        }
        System.out.println("Gia tri cua n! = " + tichGiaiThua);
        sc.close();
    }
}
