package com.example.btlandroid_nhom10_appbanmypham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        ListView listView;
        ArrayList<SanPham> arrayList;
        AdapterSanPham adapter;
        listView = findViewById(R.id.listviewsanpham);
        arrayList = new ArrayList<>();
        arrayList.add(new SanPham("1","Mặt nạ thảo dược 590.000 vnd",R.drawable.sanpham1));
        arrayList.add(new SanPham("1","SERUM THẢO DƯỢC MỘC THIÊN HƯƠNG ĐẶC TRỊ MỤN NÁM TÀN NHANG 600.000 vnd",R.drawable.sanpham2));
        arrayList.add(new SanPham("1","SERUM THẢO DƯỢC  ĐẶC TRỊ MỤN NÁM TÀN NHANG 720.000 vnd",R.drawable.sanpham3));
        arrayList.add(new SanPham("1","SERUM THẢO DƯỢC MỘC THIÊN HƯƠNG ĐẶC TRỊ MỤN NÁM 550.000 vnd",R.drawable.sanpham4));
        arrayList.add(new SanPham("1","Serum thảo mộc Thanh Dược 580.000 vnd",R.drawable.sanpham5));
        arrayList.add(new SanPham("1","Sữa rửa mặt mịn da thảo dược Bạc Hà Wondera 210.000 vnd",R.drawable.sanpham6));



        adapter = new AdapterSanPham(Screen2.this,R.layout.activity_san_pham,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Screen2.this,MainActivity_screen03.class);
                startActivity(intent);
            }
        });


    }
}