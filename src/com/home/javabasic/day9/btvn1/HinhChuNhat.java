package com.home.javabasic.day9.btvn1;

public class HinhChuNhat extends HinhHoc implements IHinhChuNhat {
    private double mChieuDai;
    private double mChieuRong;

    public HinhChuNhat(double mChieuDai, double mChieuRong) {
        this.mChieuDai = mChieuDai;
        this.mChieuRong = mChieuRong;
    }

    public double getmChieuDai() {
        return mChieuDai;
    }

    public void setmChieuDai(double mChieuDai) {
        this.mChieuDai = mChieuDai;
    }

    public double getmChieuRong() {
        return mChieuRong;
    }

    public void setmChieuRong(double mChieuRong) {
        this.mChieuRong = mChieuRong;
    }

    @Override
    public double chuVi() {
        return 2 * (mChieuDai + mChieuRong);
    }

    @Override
    public double dienTich() {
        return mChieuDai * mChieuRong;
    }

    @Override
    public double duongCheo() {
        return Math.sqrt(mChieuDai*mChieuDai + mChieuRong*mChieuRong);
    }

    @Override
    public void inThongTin() {
        System.out.print("\n\n------------------Hinh chu nhat-------------------");
        super.inThongTin();
        System.out.printf("\nDuong cheo cua hinh chu nhat: %.3f", duongCheo());
    }
}
