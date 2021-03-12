package com.home.javabasic.day9.btvn2;

public class SachGiaoKhoa extends Sach implements ISach.IMuon, ISach.IKho {
    private int mSoTrang;
    private String mTinhTrang;
    private long mSoLuongMuon;

    public SachGiaoKhoa(String mMaSach, String mTenSach, String mNhaXuatBan, int mNamXuatBan, long mSoLuongSach, int mSoTrang, String mTinhTrang, long mSoLuongMuon) {
        super(mMaSach, mTenSach, mNhaXuatBan, mNamXuatBan, mSoLuongSach);
        this.mSoTrang = mSoTrang;
        this.mTinhTrang = mTinhTrang;
        this.mSoLuongMuon = mSoLuongMuon;
    }

    public SachGiaoKhoa() {
        input();
    }

    public int getSoTrang() {
        return mSoTrang;
    }

    public void setSoTrang(int mSoTrang) {
        this.mSoTrang = mSoTrang;
    }

    public String getTinhTrang() {
        return mTinhTrang;
    }

    public void setTinhTrang(String mTinhTrang) {
        this.mTinhTrang = mTinhTrang;
    }

    public long getSoLuongMuon() {
        return mSoLuongMuon;
    }

    public void setSoLuongMuon(long mSoLuongMuon) {
        this.mSoLuongMuon = mSoLuongMuon;
    }

    @Override
    public long soLuongTonKho() {
        return getSoLuongSach() - mSoLuongMuon;
    }

    @Override
    public String viTri(String vitri) {
        return vitri;
    }

    @Override
    public void input() {
        System.out.println("\nNhap vao thong tin sach giao khoa: ");
        super.input();
        System.out.println("So trang: ");
        mSoTrang = Integer.parseInt(scanner.nextLine());
        System.out.println("Tinh trang sach: ");
        mTinhTrang = scanner.nextLine();
        System.out.println("So luong muon: ");
        mSoLuongMuon = Long.parseLong(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "***********Sach giao khoa***********"
                +super.toString()
                +"\nSo trang: " + mSoTrang
                +"\nTinh trang sach: " + mTinhTrang
                +"\nSo luong muon: " + mSoLuongMuon
                +"\nVi tri sach: " + viTri("Ke so 10")
                +"\nTon kho: " + soLuongTonKho() ;
    }
}
