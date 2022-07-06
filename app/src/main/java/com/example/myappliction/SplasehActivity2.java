package com.example.myappliction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

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

                Intent  i = new Intent(SplasehActivity2.this,SpinnerActivity.class);
                startActivity(i);
                finish();
            }
        },time);
    }
}