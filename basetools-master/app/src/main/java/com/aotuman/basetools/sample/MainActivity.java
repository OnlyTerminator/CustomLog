package com.aotuman.basetools.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.aotuman.basetools.L;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        L.e("Hello, %s ", "Hyman","---------");

        L.i("Hello  aotuman", "zxf1");

        Log.v("Hello  aotuman", "zxf2");

        L.w("Hello  aotuman", "zxf3");

        Log.d("Hello  aotuman", "zxf4");

        L.e("Hello  aotuman", "",new NullPointerException());
    }
}
