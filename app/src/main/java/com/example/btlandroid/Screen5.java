package com.example.btlandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Screen5 extends AppCompatActivity {

    ListView listviewsanpham;
    ArrayList<com.example.btlandroid.SanPham> arrayList;
    AdapterSanPham_Screen5 adapter;

    private Button btnDathang;
    private Button btnBack;
    private EditText edtHo;
    private EditText edtTen;
    private EditText edtSDT;
    private EditText edtTinh;
    private EditText edtQuan;
    private EditText edtPhuong;
    private EditText edtDiachi;
    private List<com.example.btlandroid.Thanhtoan_sc5> thanhtoanList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5);
        int hinh = getIntent().getIntExtra("hinh",0);
        String gia = getIntent().getStringExtra("gia");
        String soluong =getIntent().getStringExtra("soluong");
        listviewsanpham = findViewById(R.id.listViewS5);
        arrayList = new ArrayList<>();

        arrayList.add(new com.example.btlandroid.SanPham(gia,hinh,soluong));
        adapter = new AdapterSanPham_Screen5(Screen5.this,R.layout.custome_screen5,arrayList);
        listviewsanpham.setAdapter(adapter);
        btnDathang = findViewById(R.id.btnDat);
        btnBack=findViewById(R.id.buttonTrolai);

        edtHo = findViewById(R.id.editHo);
        edtTen =findViewById(R.id.editTen);
        edtSDT = findViewById(R.id.editSDT);
        edtTinh = findViewById(R.id.editTP);
        edtQuan = findViewById(R.id.editQuan);
        edtPhuong = findViewById(R.id.editPhuong);
        edtDiachi = findViewById(R.id.editDiachi);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Screen5.this, com.example.btlandroid.Screen04.class);
                startActivity(i);
            }
        });
        btnDathang.setOnClickListener(v -> handleBtnDat());
    }

    private void handleBtnDat() {
        com.example.btlandroid.Thanhtoan_sc5 thanhtoan = new com.example.btlandroid.Thanhtoan_sc5();
        thanhtoan.setHo(String.valueOf(edtHo.getText()));
        thanhtoan.setTen(String.valueOf(edtTen.getText()));
        thanhtoan.setSdt(Integer.parseInt(edtSDT.getText().toString()));
        thanhtoan.setTinh(String.valueOf(edtTinh.getText()));
        thanhtoan.setQuan(String.valueOf(edtQuan.getText()));
        thanhtoan.setPhuong(String.valueOf(edtPhuong.getText()));
        thanhtoan.setDiachi(String.valueOf(edtDiachi.getText()));


        Toast.makeText(getApplicationContext(),"dat hang thanh cong",Toast.LENGTH_SHORT).show();

    }
}