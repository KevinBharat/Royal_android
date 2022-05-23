package com.example.myappliction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
EditText edtusername,etdpassword;
Button btnlogin,btnsen;
TextView tvlogin;
ImageView userimge;
RadioGroup radiobuttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userimge = findViewById(R.id.userimg);

        edtusername = findViewById(R.id.etd_username);
        etdpassword = findViewById(R.id.etd_password);

        tvlogin = findViewById(R.id.tv_login);


        btnlogin = (Button) findViewById(R.id.btn_login);
        btnsen = findViewById(R.id.btn_send);
        radiobuttn = findViewById(R.id.radiobuttn);

        btnsen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
                startActivity(i);
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isAllFieldsChecked = CheckAllFields();

                int id = radiobuttn.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(id);

                String strname = edtusername.getText().toString();
                String radioName = radioButton.getText().toString();

                Toast.makeText(MainActivity.this, "User name is:-" + strname, Toast.LENGTH_LONG).show();
                tvlogin.setText(strname);
                userimge.setImageDrawable(getDrawable(R.drawable.man));
                if (isAllFieldsChecked) {
                    Intent i = new Intent(MainActivity.this, IntentActivity.class);
                    i.putExtra("KEY_NAME", strname);
                    i.putExtra("Key_Gender", radioName);
                    startActivity(i);
                }
            }

            private boolean CheckAllFields() {
                if (edtusername.length() == 0) {
                    edtusername.setError("This field is required only Name");
                    return false;
                }
                if (etdpassword.length() == 0) {
                    edtusername.setError("This field is required only Password");
                    return false;
                }
                if (etdpassword.length() == 0) {
                    edtusername.setError("This field is required only Password");
                    return false;
                }
                return true;
            }
        });
    }
}