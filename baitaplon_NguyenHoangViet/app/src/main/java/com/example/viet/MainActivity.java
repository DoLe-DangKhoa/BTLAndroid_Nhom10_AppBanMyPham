package com.example.viet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btnDathang;
    private Button btnBack;
    private EditText edtHo;
    private EditText edtTen;
    private EditText edtSDT;
    private EditText edtTinh;
    private EditText edtQuan;
    private EditText edtPhuong;
    private EditText edtDiachi;

    private List<Thanhtoan>thanhtoanList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDathang = findViewById(R.id.btnDat);

        edtHo = findViewById(R.id.editHo);
        edtTen =findViewById(R.id.editTen);
        edtSDT = findViewById(R.id.editSDT);
        edtTinh = findViewById(R.id.editTP);
        edtQuan = findViewById(R.id.editQuan);
        edtPhuong = findViewById(R.id.editPhuong);
        edtDiachi = findViewById(R.id.editDiachi);
        btnDathang.setOnClickListener(v -> handleBtnDat());
    }

    private void handleBtnDat() {
        Thanhtoan thanhtoan = new Thanhtoan();
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