package com.example.btlandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Screen04 extends AppCompatActivity {

    ListView listviewsanpham;
    ArrayList<SanPham> arrayList;
    AdapterSanPham_Screen04 adapter;
    Button btnDong,btnThanhToan;
    Integer i;
    TextView tvTongTien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen04);

        int hinh = getIntent().getIntExtra("hinh",0);
        String gia = getIntent().getStringExtra("gia");
        String soluong =getIntent().getStringExtra("soluong");
        String tongtien = getIntent().getStringExtra("tongtien");

        tvTongTien = findViewById(R.id.tvTongTien);
        tvTongTien.setText(tongtien);

        listviewsanpham = findViewById(R.id.listviewsanpham);
        arrayList = new ArrayList<>();

        arrayList.add(new SanPham(gia,hinh,soluong));
        adapter = new AdapterSanPham_Screen04(Screen04.this,R.layout.custome_screen04,arrayList);
        listviewsanpham.setAdapter(adapter);


        btnDong = findViewById(R.id.btnDong);
        btnDong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Screen04.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btnThanhToan = findViewById(R.id.btnThanhToan);
        btnThanhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Screen04.this,Screen5.class);

                intent.putExtra("hinh",hinh);
                intent.putExtra("gia",gia);
                intent.putExtra("soluong",soluong);
                Toast.makeText(Screen04.this, "Data has been Share To Screen05 successfully!", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
    }
}