package com.example.myappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeDateandtimeActivity extends AppCompatActivity {
TextView tvtime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dateandtime);
        tvtime=findViewById(R.id.tvi_time);
        Intent i=getIntent();
        tvtime.setText("Time:-"+i.getStringExtra("KEY_hour"));
    }
}