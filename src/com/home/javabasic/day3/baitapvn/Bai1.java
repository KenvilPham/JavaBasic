package com.home.javabasic.day3.baitapvn;

import java.util.Scanner;

public class Bai1 {
    public static boolean isPrimeNumber(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                isPrime = false;
                break;
            } else {
                continue;
            }
        }

        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong n = ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu i = " + (i+1));
            arr[i] = sc.nextInt();
        }

        System.out.printf("Mang nhap vao la: ");
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

        System.out.println("\nGia tri lon nhat cua mang la max =" + max);
        System.out.println("Gia tri nho nhat cua mang la max =" + min);

        int countEvenNumber = 0;
        System.out.printf("Cac so chan cua mang la: ");
        for (int i = 0; i < n; i++) {
            if (arr[i]%2 == 0) {
                System.out.printf("%d ", arr[i]);
                countEvenNumber++;
            }
        }
        System.out.println("\nSo so chan cua mang la: " + countEvenNumber);

        int countPrimeNumber = 0;
        System.out.printf("Cac so nguyen to cua mang la: ");
        for (int i = 0; i < n; i++) {
            if (isPrimeNumber(arr[i])) {
                System.out.printf("%d ", arr[i]);
                countPrimeNumber++;
            }
        }
        System.out.println("\nSo so nguyen to cua mang la: " + countPrimeNumber);

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.printf("Mang sap xep theo thu tu tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }

        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        System.out.printf("\nMang sap xep theo thu tu giam dan: ");
        for(int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
