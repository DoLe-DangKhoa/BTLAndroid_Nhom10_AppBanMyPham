package com.example.btlandroid_nhom10_appbanmypham;

public class SanPham {
    private  String gia;
    private int hinh;


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

    public SanPham(String tenSoluong, String gia, int hinh) {
        this.gia = gia;
        this.hinh = hinh;
    }
}
