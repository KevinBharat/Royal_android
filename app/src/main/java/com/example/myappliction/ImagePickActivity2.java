package com.example.myappliction;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImagePickActivity2 extends AppCompatActivity {
    Button btn_gallely;
    ImageView img_gall;
    Button btn_Camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_pick2);
        btn_gallely=findViewById(R.id.btn_gallely);
        img_gall=findViewById(R.id.img_bg);
        btn_Camera=findViewById(R.id.btn_Camera);
        btn_Camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent();
                i.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,11);
            }
        });
        btn_gallely.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent();
                i.setType("image/*");
                i.setAction(Intent.ACTION_PICK);
                startActivityForResult(i,10);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==10){
          Uri uri=data.getData();
          img_gall.setImageURI(uri);

        }
        if(requestCode==11){
            Bitmap bitmap=(Bitmap) data.getExtras().get("data");
            img_gall.setImageBitmap(bitmap);
        }
    }
}