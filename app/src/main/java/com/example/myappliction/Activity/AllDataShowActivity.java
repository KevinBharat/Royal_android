package com.example.myappliction.Activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import state.hwork.sqlitedatabaseapp.R;

public class AllDataShowActivity extends AppCompatActivity {
ListView alldatalist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_data_show);
        alldatalist=findViewById(R.id.alldatalist);
    }
}