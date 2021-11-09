package com.example.btl_android2_screen03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterSanPham extends BaseAdapter {

    private Context context;
    private  int layout;
    private List<Sanpham> arraylist;

    public AdapterSanPham(Context context, int layout, List<Sanpham> arraylist) {
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
        Sanpham sanpham = arraylist.get(position);
         TextView textv1 = convertView.findViewById(R.id.textView4);
//        TextView textv2 = convertView.findViewById(R.id.textView12);
        TextView textv3 = convertView.findViewById(R.id.textview9);
        ImageView imageV = convertView.findViewById(R.id.imageView7);

        textv1.setText(sanpham.getGia());
//        textv2.setText(sanpham.getTenSoluong());
        imageV.setImageResource(sanpham.getHinh());
        textv3.setText(sanpham.getMota());


        return convertView;
    }
}
