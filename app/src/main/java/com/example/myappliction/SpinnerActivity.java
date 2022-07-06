package com.example.myappliction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SpinnerActivity extends AppCompatActivity {
    Spinner spinner;
    TextView tvSpinner;
    String strLang[] = {"Select item","Android","java",".net","PHP","Flutter","IOS","Python"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = findViewById(R.id.spinner);
        tvSpinner = findViewById(R.id.tv_selected_item);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,strLang){

            @Override
            public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                TextView tvData = (TextView)  super.getDropDownView(position, convertView, parent);
                if (position == 0){
                    tvData.setTextColor(Color.GRAY);
                }else {
                    tvData.setTextColor(Color.BLUE);
                }
                return tvData;
            }
        };
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position != 0){
                    String strData = parent.getItemAtPosition(position).toString();
                    tvSpinner.setText("Selected item is "+strData);
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}