package com.example.myappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class DatetimeActivity extends AppCompatActivity {
    TextView tvtdate,tvtime;
    Button btn_date,btntime,btnprint;
    int day,month,year;
    private int hour;
    private int minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datetime);
        tvtdate=findViewById(R.id.tv_date);
        btn_date=findViewById(R.id.btn_Date);

        tvtime=findViewById(R.id.tv_time);
        btntime=findViewById(R.id.btn_time);

        btnprint=findViewById(R.id.btn_print);

        Calendar calendar = Calendar.getInstance();
        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);
        hour =calendar.get(Calendar.HOUR);
        minute=calendar.get(Calendar.MINUTE);
        btnprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(DatetimeActivity.this,HomeDateandtimeActivity.class);
                i.putExtra("KEY_hour",tvtime.getText().toString());

                startActivity(i);
            }
        });
        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialog timePickerDialog=new TimePickerDialog(DatetimeActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                        tvtime.setText(hour+":"+minute);

                    }
                },hour,minute,false);
                timePickerDialog.show();
            }
        });
        btn_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(DatetimeActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                                tvtdate.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                            }
                        }, year, month, day);
                datePickerDialog.show();
            }
        });
    }
}