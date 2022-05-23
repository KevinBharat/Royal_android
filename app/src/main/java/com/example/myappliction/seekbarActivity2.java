package com.example.myappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class seekbarActivity2 extends AppCompatActivity {

    private SeekBar seekbar;
    private TextView tvseekbar;
    private Button btnprint;
    private RatingBar ratingbar;
    private TextView tvratingbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar2);
        seekbar=(SeekBar)findViewById(R.id.seekbar);
        tvseekbar=(TextView)findViewById(R.id.tv_seekbar);
        btnprint=(Button)findViewById(R.id.btn_print);
        ratingbar=(RatingBar)findViewById(R.id.ratingbar);
        tvratingbar=(TextView)findViewById(R.id.tv_ratingbar);

        ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
               tvratingbar.setText(String.valueOf(v));
            }
        });
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
               String p=String.valueOf(i);
                tvseekbar.setText(p);
                btnprint.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent k=new Intent(seekbarActivity2.this,seekbarprint.class);
                        k.putExtra("print",p);
                        startActivity(k);
                    }
                });
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}