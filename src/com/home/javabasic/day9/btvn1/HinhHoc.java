package com.home.javabasic.day9.btvn1;

public abstract class HinhHoc {

    public void inThongTin() {

        System.out.printf("\nChu vi: %.3f", chuVi());
        System.out.printf("\nDien tich: %.3f", dienTich());
    }
    public abstract double chuVi();
    public abstract double dienTich();
}
