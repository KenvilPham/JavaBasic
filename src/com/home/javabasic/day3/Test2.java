package com.home.javabasic.day3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc ma tran nxn");
        int n = sc.nextInt();
        int[][] arr = new int [n][n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.printf("%d \t",arr[i][j]);
                if (j == i) {
                    sum += arr[i][j];
                    if (max < arr[i][j]) {
                        max = arr[i][j];
                    }

                    if (min > arr[i][j]) {
                        min = arr[i][j];
                    }
                }
            }
        }

        System.out.println("\nTong cac phan tu tren duong cheo chinh la: sum = " + sum);

        System.out.println("Gia tri lon nhat cac phan tu tren duong cheo chinh la: max = " + max);
        System.out.println("Gia tri nho nhat cac phan tu tren duong cheo chinh la: min = " + min);
        sc.close();
    }
}
