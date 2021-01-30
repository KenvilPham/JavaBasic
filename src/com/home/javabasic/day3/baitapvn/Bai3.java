package com.home.javabasic.day3.baitapvn;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc cua mang 3 chieu (m, n, k)");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int h = sc.nextInt();

        int[][][] arr = new int[m][n][h];
        int sum = 0;

        System.out.println("Nhap vao cac phan tu cua mang 3 chieu: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < h; k++) {
                    System.out.println("Nhap vao arr["+i+"]["+j+"]["+k+"] = ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("\nMang da nhap la: ");
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.println();
                for (int k = 0; k < h; k++) {
                    System.out.printf("%d\t", arr[i][j][k]);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < h; k++) {
                    if (arr[i][j][k] % 5 == 0) {
                        sum += arr[i][j][k];
                    }
                }
            }
        }

        System.out.println("Tong cac phan tu chia het cho 5 la sum = " + sum);
        sc.close();
    }
}
