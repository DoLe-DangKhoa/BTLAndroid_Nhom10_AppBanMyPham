package com.example.btlandroid_nhom10_appbanmypham;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity_screen03 extends AppCompatActivity {
    Button btnThemVaoGioHang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen03);

        btnThemVaoGioHang = findViewById(R.id.btnThemVaoGioHang);
        ListView listView;
        ArrayList<com.example.btlandroid_nhom10_appbanmypham.Sanpham_screen03> arrayList;
        com.example.btlandroid_nhom10_appbanmypham.AdapterSanPham_screen03 adapter;
        listView = findViewById(R.id.listviewsanpham);
        arrayList = new ArrayList<>();
        arrayList.add(new com.example.btlandroid_nhom10_appbanmypham.Sanpham_screen03("1","590.000 vnd",R.drawable.ddd,"Với thành phần chính bao gồm nhiều loại thảo dược cao cấp như Phấn hoa, hồng sâm, tam thất, cúc la mã, đào hoa, nhau thai cừu, ngọc trai, linh chi, nghệ đen, mật ong nguyên tổ,… serum thảo dược Mộc Thiên Hương sẽ đem lại hiệu quả tối ưu nhất, giúp bạn hoàn thành mong ước có được một làn da khỏe đẹp bấy lâu.\n"));
    


        adapter = new com.example.btlandroid_nhom10_appbanmypham.AdapterSanPham_screen03(MainActivity_screen03.this,R.layout.layout_sanpham_activity_mainscreen03,arrayList);
        listView.setAdapter(adapter);

        btnThemVaoGioHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_screen03.this,MainActivity_sc4.class);
                startActivity(intent);
            }
        });
    }
}