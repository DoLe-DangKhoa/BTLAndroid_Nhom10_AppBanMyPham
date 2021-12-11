package com.example.btlandroid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MyService extends Service {
    private MyBinder myBinder = new MyBinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return myBinder;
    }

    public class MyBinder extends Binder {
        MyService getService() {
            return MyService.this;
        }
    }


    public int TinhSoLuong(int soluong, String type) {
        if (type.equalsIgnoreCase("+") )
            return soluong + 1;
        else{
            if (soluong == 0)
                return 0;
            else
                return soluong - 1 ;
        }

    }
    public double TinhTongTien(int soluong, double dongia){
        return soluong * dongia;
    }
}