package com.example.btlandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterSanPham_Screen03 extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<SanPham> arraylist;

    public AdapterSanPham_Screen03(Context context, int layout, List<SanPham> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;

    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        SanPham sanpham = arraylist.get(position);
        TextView gia = convertView.findViewById(R.id.tvGia);
        TextView ten = convertView.findViewById(R.id.tvTen);
        TextView mota = convertView.findViewById(R.id.tvMota);
        ImageView imgHinh = convertView.findViewById(R.id.imgSanpham);

        gia.setText(sanpham.getGia());
        ten.setText(sanpham.getTen());
        mota.setText(sanpham.getMota());
        imgHinh.setImageResource(sanpham.getHinh());

        return convertView;
    }
}
