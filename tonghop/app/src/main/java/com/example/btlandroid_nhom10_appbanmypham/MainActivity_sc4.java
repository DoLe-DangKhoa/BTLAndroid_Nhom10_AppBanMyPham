package com.example.btlandroid_nhom10_appbanmypham;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity_sc4 extends AppCompatActivity {
    Button btnDong,btnThanhToan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sc4);

        btnThanhToan = findViewById(R.id.btnThanhToan);
        btnDong =findViewById(R.id.btnDong);
        ListView listView;
        ArrayList<com.example.btlandroid_nhom10_appbanmypham.Sanpham_sc4> arrayList;
        com.example.btlandroid_nhom10_appbanmypham.AdapterSanPham_sc4 adapter;
        listView = findViewById(R.id.listviewsanpham);
        arrayList = new ArrayList<>();
        arrayList.add(new com.example.btlandroid_nhom10_appbanmypham.Sanpham_sc4("1","590.000 vnd",R.drawable.sp1));
//        arrayList.add(new com.example.btlandroid_nhom10_appbanmypham.Sanpham_sc4("1","600.000 vnd",R.drawable.sp2));
//        arrayList.add(new com.example.btlandroid_nhom10_appbanmypham.Sanpham_sc4("1","720.000 vnd",R.drawable.sp3));
//        arrayList.add(new com.example.btlandroid_nhom10_appbanmypham.Sanpham_sc4("1","550.000 vnd",R.drawable.sp4));
//        arrayList.add(new com.example.btlandroid_nhom10_appbanmypham.Sanpham_sc4("1","580.000 vnd",R.drawable.sp5));


        adapter = new com.example.btlandroid_nhom10_appbanmypham.AdapterSanPham_sc4(MainActivity_sc4.this,R.layout.layout_sanpham_sc4,arrayList);
        listView.setAdapter(adapter);

        btnThanhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_sc4.this,MainActivity_sc5.class);
                startActivity(intent);
            }
        });
        btnDong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_sc4.this,Screen2.class);
                startActivity(intent);
            }
        });
    }
}