package com.example.myappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {
TextView tvuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        tvuser=findViewById(R.id.tv_user);
        Intent i=getIntent();
        String radioName=i.getStringExtra("Key_Gender");
        String struser=i.getStringExtra("KEY_NAME");
        tvuser.setText(struser+" "+radioName);
    }
}