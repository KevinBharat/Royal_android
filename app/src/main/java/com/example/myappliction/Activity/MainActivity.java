package com.example.myappliction.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import state.hwork.sqlitedatabaseapp.R;

public class MainActivity extends AppCompatActivity {
    Button btnadd,btnDisplay;
    EditText editname,editnamelast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnadd=findViewById(R.id.btn_add);
        btnDisplay=findViewById(R.id.Display);
        editname=findViewById(R.id.name);
        editnamelast=findViewById(R.id.name_last);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}