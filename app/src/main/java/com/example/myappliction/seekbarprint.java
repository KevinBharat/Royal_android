package com.example.myappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class seekbarprint extends AppCompatActivity {

    private TextView tvprint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbarprint2);
        tvprint=(TextView)findViewById(R.id.tv_print);
        Intent k=getIntent();
        String print=k.getStringExtra("print");
        tvprint.setText(print);

    }
}