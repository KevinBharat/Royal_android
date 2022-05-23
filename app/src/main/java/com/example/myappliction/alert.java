package com.example.myappliction;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class alert extends AppCompatActivity {
    Button btnalert,btncustalert,btncumtoast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        btnalert=findViewById(R.id.btn_alert);
        btncustalert=findViewById(R.id.btn_cust_alert);
        btncumtoast=findViewById(R.id.btn_cust_toast);

        btncumtoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater layoutInflater =getLayoutInflater();
                View myview=layoutInflater.inflate(R.layout.raw_toast,null);
                Toast toast=new Toast(alert.this);
                toast.setView(myview);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }

        });
        btncustalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater layoutInflater =getLayoutInflater();
                View myview=layoutInflater.inflate(R.layout.raw_custom_dialoge,null);
                AlertDialog.Builder builder=new AlertDialog.Builder(alert.this);
                AlertDialog alertDialog=builder.create();
                alertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                alertDialog.setView(myview);

                Button btnCancel=myview.findViewById(R.id.btn_cancel);
                Button btnsearch=myview.findViewById(R.id.btn_search);
                EditText etbox=myview.findViewById(R.id.edt_email);

                btnsearch.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LayoutInflater layoutInflater  = getLayoutInflater();
                        View myToast = layoutInflater.inflate(R.layout.raw_toast,null);

                        Toast toast =  new Toast(alert.this);
                        TextView tvtoast=myToast.findViewById(R.id.tvdata);
                        tvtoast.setText(etbox.getText().toString());
                        toast.setView(myToast);
                        toast.setDuration(Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
                btnCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(alertDialog.isShowing()){
                            alertDialog.dismiss();
                        }
                    }
                });
                alertDialog.show();
            }
        });
         btnalert.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               AlertDialog.Builder builder =new AlertDialog.Builder(alert.this);
               builder.setIcon(R.drawable.man);
               builder.setTitle("Alert Dialog");
               builder.setMessage("Are you sure, you want to delete this file ?");
               builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                       Toast.makeText(alert.this, "Yes is clicked", Toast.LENGTH_SHORT).show();
                   }
               });

               builder.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                       Toast.makeText(alert.this, "No", Toast.LENGTH_SHORT).show();
                   }
               });
               builder.setNeutralButton("finish", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                       dialog.dismiss();
                   }
               });

               builder.show();



           }
       });
    }
}