package com.example.myappliction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SimpleListviewshoActivity extends AppCompatActivity {
    TextView tvUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_listviewsho);

        tvUsername = findViewById(R.id.tv_username);
        Intent i = getIntent();
        String strUsername = i.getStringExtra("KEY_DATA");

        tvUsername.setText("Welcome "+strUsername );
    }
}