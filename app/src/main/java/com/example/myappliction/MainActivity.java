package com.example.myappliction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edtusername;
Button btnlogin,btnsen;
TextView tvlogin;
ImageView userimge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtusername=findViewById(R.id.etd_username);
        btnlogin=(Button) findViewById(R.id.btn_login);
        tvlogin=findViewById(R.id.tv_login);
        userimge=findViewById(R.id.userimg);
        btnsen=findViewById(R.id.btn_send);
        btnsen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
                startActivity(i);
            }
        });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strname=edtusername.getText().toString();
                Toast.makeText(MainActivity.this,"User name is:-"+strname,Toast.LENGTH_LONG).show();
                tvlogin.setText(strname);
                userimge.setImageDrawable(getDrawable(R.drawable.man));
                Intent i =new Intent(MainActivity.this,IntentActivity.class);
                i.putExtra("KEY_NAME",strname);
                startActivity(i);

            }
        });
    }
}