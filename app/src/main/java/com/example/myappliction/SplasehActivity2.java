package com.example.myappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;

public class SplasehActivity2 extends AppCompatActivity {
int time=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splaseh2);
        GifImageView gifImageView = findViewById(R.id.img_gif);
        gifImageView.setGifImageResource(R.drawable.androidgi);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent  i = new Intent(SplasehActivity2.this,DatetimeActivity.class);
                startActivity(i);
                finish();
            }
        },time);
    }
}