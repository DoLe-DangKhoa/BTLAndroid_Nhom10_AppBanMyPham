package com.example.btl_android2_screen03;

public class Sanpham {
    private  String tenSoluong;
    private  String gia;
    private int hinh;
    private   String mota;

    public Sanpham(String tenSoluong, String gia, int hinh, String mota) {
        this.tenSoluong = tenSoluong;
        this.gia = gia;
        this.hinh = hinh;
        this.mota = mota;
    }

    public String getTenSoluong() {
        return tenSoluong;
    }

    public void setTenSoluong(String tenSoluong) {
        this.tenSoluong = tenSoluong;
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
}
