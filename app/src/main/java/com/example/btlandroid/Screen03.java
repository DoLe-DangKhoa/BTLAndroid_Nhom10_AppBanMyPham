package com.example.baitaplon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Screen03 extends AppCompatActivity {
    ListView listviewsanpham;
    ArrayList<SanPham> arrayList;
    AdapterSanPham_Screen03 adapter;
    TextView  tvSoLuong;
    int soluong,kq;
    double tongtien;
    String gia;
    Button btnTru, btnCong,btnThemVaoGioHang;
    private MyService myService;
    private boolean isconnect = false;
    private ServiceConnection mConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MyService.MyBinder binder = (MyService.MyBinder) iBinder;
            myService = binder.getService();
            isconnect = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            isconnect = false;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen03);

        listviewsanpham = findViewById(R.id.listviewsanpham);
        arrayList = new ArrayList<>();
        String ten = getIntent().getStringExtra("ten");
        gia = getIntent().getStringExtra("gia");
        int hinh = getIntent().getIntExtra("hinh",0);

        arrayList.add(new SanPham(ten,gia,hinh,"Với thành phần chính bao gồm nhiều loại thảo dược cao cấp như Phấn hoa, hồng sâm, tam thất, cúc la mã, đào hoa, nhau thai cừu, ngọc trai, linh chi, nghệ đen, mật ong nguyên tổ,… serum thảo dược Mộc Thiên Hương sẽ đem lại hiệu quả tối ưu nhất, giúp bạn hoàn thành mong ước có được một làn da khỏe đẹp bấy lâu.\n"));
        adapter = new AdapterSanPham_Screen03(Screen03.this,R.layout.custome_screen03,arrayList);
        listviewsanpham.setAdapter(adapter);

        tvSoLuong = findViewById(R.id.tvSoLuong);
        Intent intent = new Intent(Screen03.this, MyService.class);
        bindService(intent, mConnection, BIND_AUTO_CREATE);
        btnCong = findViewById(R.id.btnCong);
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soluong = Integer.valueOf(tvSoLuong.getText().toString());
//                String type =btnTru.getText().toString().trim();

                kq = myService.TinhSoLuong(soluong,"+");
//                Log.d("Ket qua :", "Ket qua" +myService.TinhSoLuong(soluong,"+"));

                tvSoLuong.setText(String.valueOf(kq));
            }
        });
        btnTru = findViewById(R.id.btnTru);
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soluong = Integer.valueOf(tvSoLuong.getText().toString());
//                String type =btnTru.getText().toString().trim();

                kq = myService.TinhSoLuong(soluong,"-");
//                Log.d("Ket qua :", "Ket qua" +myService.TinhSoLuong(soluong,"-"));

                tvSoLuong.setText(String.valueOf(kq));
            }
        });

        btnThemVaoGioHang = findViewById(R.id.btnThemVaoGioHang);
        btnThemVaoGioHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Screen03.this,Screen04.class);
                intent.putExtra("hinh",hinh);
                intent.putExtra("gia",gia);
                intent.putExtra("soluong",tvSoLuong.getText().toString());
                String[] stringDonGia = gia.split("vnd");
                double dongia = Double.parseDouble(stringDonGia[0]);

                tongtien = myService.TinhTongTien(kq, dongia);
                String tong = String.valueOf(tongtien);
//                Log.d("Ket qua :", "TongTien" +tongtien);
                intent.putExtra("tongtien",tong);
                Toast.makeText(Screen03.this, "Data has been Share To Screen04 successfully!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }
}