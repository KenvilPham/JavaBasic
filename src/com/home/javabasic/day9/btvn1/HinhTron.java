package com.home.javabasic.day9.btvn1;

public class HinhTron extends HinhHoc implements IHinhTron {
    private double mBanKinh;

    public HinhTron(double banKinh) {
        this.mBanKinh = banKinh;
    }

    public double getBanKinh() {
        return mBanKinh;
    }

    public void setBanKinh(double banKinh) {
        this.mBanKinh = banKinh;
    }

    @Override
    public double chuVi() {
        return 2 * mBanKinh * Math.PI;
    }

    @Override
    public double dienTich() {
        return mBanKinh * mBanKinh * Math.PI;
    }

    @Override
    public double duongKinh() {
        return 2 * mBanKinh;
    }

    @Override
    public void inThongTin() {
        System.out.print("\n\n------------------Hinh tron-------------------");
        super.inThongTin();
        System.out.printf("\nDuong kinh hinh tron: %.3f", duongKinh());
    }
}
