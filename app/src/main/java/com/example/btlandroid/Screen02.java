package com.example.btlandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Screen02 extends AppCompatActivity {

    ListView listView;
    ArrayList<SanPham> arrayList;
    AdapterSanPham adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen02);

        listView = findViewById(R.id.listviewsanpham);
        arrayList = new ArrayList<>();
        arrayList.add(new SanPham("SERUM THẢO DƯỢC MỘC THIÊN HƯƠNG ĐẶC TRỊ MỤN NÁM","720.000 vnd",R.drawable.sanpham1));
        arrayList.add(new SanPham("SERUM THẢO DƯỢC MỘC THIÊN HƯƠNG ĐẶC TRỊ MỤN NÁM TÀN NHANG","600.000 vnd ",R.drawable.sanpham2));
        arrayList.add(new SanPham("SERUM THẢO DƯỢC  ĐẶC TRỊ MỤN NÁM TÀN NHANG","720.000 vnd  ",R.drawable.sanpham3));
        arrayList.add(new SanPham("Sữa rửa mặt mịn da thảo dược ","550.000 vnd ",R.drawable.sanpham4));
        arrayList.add(new SanPham("Serum thảo mộc Thanh Dược","580.000 vnd",R.drawable.sanpham5));
        arrayList.add(new SanPham("Sữa rửa mặt mịn da thảo dược Bạc Hà Wondera"," 210.000 vnd ",R.drawable.sanpham6));
        arrayList.add(new SanPham("Bạc Hà Wondera "," 280.000 vnd ",R.drawable.dautamhoasu));
        arrayList.add(new SanPham("Sữa rửa mặt mịn da thảo dược Bạc Hà Wondera "," 210.000 vnd",R.drawable.suaruamattraxanh));
        arrayList.add(new SanPham("Sữa rửa mặt mịn da thảo dược Bạc Hà Wondera "," 250.000 vnd",R.drawable.serumlohoi));



        adapter = new AdapterSanPham(Screen02.this,R.layout.activity_san_pham,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Screen02.this,Screen03.class);
                SanPham sp = arrayList.get(i);
                intent.putExtra("gia", sp.getGia());
                intent.putExtra("ten", sp.getTen());
                intent.putExtra( "hinh", sp.getHinh());
                Toast.makeText(Screen02.this, "Data has been Share To list successfully!", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });


    }


}