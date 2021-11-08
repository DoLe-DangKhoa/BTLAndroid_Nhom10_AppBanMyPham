package com.example.btlandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ArrayList<Sanpham> arrayList;
        AdapterSanPham adapter;
        listView = findViewById(R.id.listviewsanpham);
        arrayList = new ArrayList<>();
        arrayList.add(new Sanpham("1","590.000 vnd",R.drawable.sp1));
        arrayList.add(new Sanpham("1","600.000 vnd",R.drawable.sp2));
        arrayList.add(new Sanpham("1","720.000 vnd",R.drawable.sp3));
        arrayList.add(new Sanpham("1","550.000 vnd",R.drawable.sp4));
        arrayList.add(new Sanpham("1","580.000 vnd",R.drawable.sp5));


        adapter = new AdapterSanPham(MainActivity.this,R.layout.layout_sanpham,arrayList);
        listView.setAdapter(adapter);

    }
}