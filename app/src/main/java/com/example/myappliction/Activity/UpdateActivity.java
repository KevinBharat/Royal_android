package com.example.myappliction.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import state.hwork.sqlitedatabaseapp.R;

public class UpdateActivity extends AppCompatActivity {
Button btnupdate,btndelete;
EditText update_name,uname_last;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        btndelete=findViewById(R.id.btn_Delete);
        btnupdate=findViewById(R.id.btn_UPdate);
        update_name=findViewById(R.id.update_name);
        uname_last=findViewById(R.id.uname_last);
        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}