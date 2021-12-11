package com.example.baitaplon;

public class SanPham {
    private String ten;
    private String gia;
    private int hinh;
    private String mota;
    private String soluong;

    public SanPham(String ten, String gia, int hinh, String mota) {
        this.ten = ten;
        this.gia = gia;
        this.hinh = hinh;
        this.mota = mota;
    }

    public SanPham(String ten, String gia, int hinh) {
        this.ten = ten;
        this.gia = gia;
        this.hinh = hinh;
    }


    public SanPham(String gia, int hinh) {
        this.gia = gia;
        this.hinh = hinh;
    }

    public SanPham(String gia, int hinh, String soluong) {
        this.gia = gia;
        this.hinh = hinh;
        this.soluong = soluong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }
}
