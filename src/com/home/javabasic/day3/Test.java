package com.home.javabasic.day3;

import java.util.Scanner;

public class Test {
    public static void swapNumber(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong n = ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu i = " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Mang nhap vao la: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Gia tri lon nhat cua mang la max =" + max);
        System.out.println("Gia tri nho nhat cua mang la max =" + min);

        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        System.out.println("Mang da dao nguoc lai: ");
        for(int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }

        sc.close();
    }
}
