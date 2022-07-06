package com.example.myappliction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class SimpleListviewActivity extends AppCompatActivity {
    ListView listView;
    String stdData[] = {"Product 1","Product 2","Product 3","Product 4","Product 5",
            "Product 6","Product 7","Product 8"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_listview);
        listView=findViewById(R.id.list_view);

        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,stdData);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String strData = parent.getItemAtPosition(position).toString();
                Intent i = new Intent(SimpleListviewActivity.this,SimpleListviewshoActivity.class);
                i.putExtra("KEY_DATA",strData);
                startActivity(i);
            }
        });
    }
}