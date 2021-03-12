package com.home.javabasic.day9.btvn2;

import java.util.Scanner;

public abstract class Sach {
    private String mMaSach;
    private String mTenSach;
    private String mNhaXuatBan;
    private int mNamXuatBan;
    private long mSoLuongSach;

    Scanner scanner = new Scanner(System.in);

    public Sach(String mMaSach, String mTenSach, String mNhaXuatBan, int mNamXuatBan, long mSoLuongSach) {
        this.mMaSach = mMaSach;
        this.mTenSach = mTenSach;
        this.mNhaXuatBan = mNhaXuatBan;
        this.mNamXuatBan = mNamXuatBan;
        this.mSoLuongSach = mSoLuongSach;
    }

    public Sach() {

    }

    public String getMaSach() {
        return mMaSach;
    }

    public void setMaSach(String mMaSach) {
        this.mMaSach = mMaSach;
    }

    public String getTenSach() {
        return mTenSach;
    }

    public void setTenSach(String mTenSach) {
        this.mTenSach = mTenSach;
    }

    public String getNhaXuatBan() {
        return mNhaXuatBan;
    }

    public void setNhaXuatBan(String mNhaXuatBan) {
        this.mNhaXuatBan = mNhaXuatBan;
    }

    public int getNamXuatBan() {
        return mNamXuatBan;
    }

    public void setNamXuatBan(int mNamXuatBan) {
        this.mNamXuatBan = mNamXuatBan;
    }

    public long getSoLuongSach() {
        return mSoLuongSach;
    }

    public void setSoLuongSach(long mSoLuongSach) {
        this.mSoLuongSach = mSoLuongSach;
    }

    public void input() {
        System.out.println("Ma sach: ");
        mMaSach = scanner.nextLine();
        System.out.println("Ten sach: ");
        mTenSach = scanner.nextLine();
        System.out.println("Nha xuat ban sach: ");
        mNhaXuatBan = scanner.nextLine();
        System.out.println("Nam xuat ban sach: ");
        mNamXuatBan = Integer.parseInt(scanner.nextLine());
        System.out.println("So luong sach: ");
        mSoLuongSach = Long.parseLong(scanner.nextLine())/*scanner.nextLong()*/;
    }

    @Override
    public String toString() {
        return "\nMa sach: " + mMaSach
                +"\nTen sach: " + mTenSach
                +"\nNha xuat ban sach: " + mNhaXuatBan
                +"\nNam xuat ban sach: " + mNamXuatBan
                +"\nSo luong sach: " + mSoLuongSach;
    }
}
