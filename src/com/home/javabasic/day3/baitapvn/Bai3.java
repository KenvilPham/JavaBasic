package com.home.javabasic.day3.baitapvn;

import java.util.Scanner;

public class Bai3 {

    public static void inMaTran(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                System.out.printf("%d\t", arr[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n = ");
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];

        int[][] C = new int[n][n];

        int[][] D = new int[n][n];
        int[][] E = new int[n][n];

        System.out.println("Nhap vao cac phan tu cua ma tran A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Nhap vao cac phan tu cua ma tran B: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMa tran A da nhap la: ");
        inMaTran(A, n, n);
        System.out.println("\nMa tran B da nhap la: ");
        inMaTran(B, n, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("\nTong cua 2 ma tran A va B la C = ");
        inMaTran(C, n, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                D[i][j] = A[j][i];
                E[i][j] = B[j][i];
            }
        }

        System.out.println("\nMa tran chuyen vi cua ma tran A la D = ");
        inMaTran(D, n, n);

        System.out.println("\nMa tran chuyen vi cua ma tran B la E = ");
        inMaTran(E, n, n);
    }
}
