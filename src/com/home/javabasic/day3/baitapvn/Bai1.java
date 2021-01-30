package com.home.javabasic.day3.baitapvn;

import java.util.Scanner;

public class Bai1 {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang n = ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap vao cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu i = " + (i+1));
            arr[i] = sc.nextInt();
        }

        System.out.println("\nMang da nhap arr: ");
        printArr(arr);

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[j] >= arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("\nMang da sap xep giam dan la: ");
        printArr(arr);

        System.out.println("\nPhan tu lon nhat cua mang la arr[0] = : " + arr[0]);
        System.out.println("Phan tu lon thu 2 cua mang la arr[1] = : " + arr[1]);

        sc.close();
    }
}
