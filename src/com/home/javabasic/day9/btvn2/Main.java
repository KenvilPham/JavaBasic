package com.home.javabasic.day9.btvn2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Sach mSach;
        List<Sach> mListSach = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so luong sach can dung: ");
        int mSoLuongSachCanDung = sc.nextInt();

        for (int i = 0; i < mSoLuongSachCanDung; i++) {
            System.out.println("Nhap loai tai lieu: " +
                    "\n1 - Sach giao khoa " +
                    "\n2 - Do an" +
                    "\n3 - Tai lieu dien tu");

            int mLoaiSach = sc.nextInt();
            switch (mLoaiSach) {
                case 1:
                    mSach = new SachGiaoKhoa();
                    mListSach.add(mSach);
                    break;
                case 2:
                    mSach = new DoAn();
                    mListSach.add(mSach);
                    break;
                case 3:
                    mSach = new TaiLieuDienTu();
                    mListSach.add(mSach);
                    break;
            }
        }

        for (Sach s : mListSach) {
            System.out.println(s.toString());
        }
    }
}
