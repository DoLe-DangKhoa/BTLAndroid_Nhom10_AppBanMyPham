package com.example.btl_android2_screen03;

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
        arrayList.add(new Sanpham("1","590.000 vnd",R.drawable.ddd,"Với thành phần chính bao gồm nhiều loại thảo dược cao cấp như Phấn hoa, hồng sâm, tam thất, cúc la mã, đào hoa, nhau thai cừu, ngọc trai, linh chi, nghệ đen, mật ong nguyên tổ,… serum thảo dược Mộc Thiên Hương sẽ đem lại hiệu quả tối ưu nhất, giúp bạn hoàn thành mong ước có được một làn da khỏe đẹp bấy lâu.\n"));
    


        adapter = new AdapterSanPham(MainActivity.this,R.layout.layout_sanpham,arrayList);
        listView.setAdapter(adapter);
    }
}