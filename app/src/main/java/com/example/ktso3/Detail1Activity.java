package com.example.ktso3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail1Activity extends AppCompatActivity {
    private TextView name,Mota,Danhgia;
    private ImageView images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);
        name=findViewById(R.id.edt_so1);
        Mota=findViewById(R.id.edt_so3);
        Danhgia=findViewById(R.id.edt_so2);
        images=findViewById(R.id.img_nhavan1);

        Intent myintent = getIntent();
        String namenhavan = myintent.getStringExtra("name");
        name.setText(namenhavan);

        Intent myintent2 = getIntent();
        String motanhavan = myintent.getStringExtra("Mota");
        Mota.setText(motanhavan);

        Intent myintent3 = getIntent();
        String danhgia = myintent.getStringExtra("Danhgia");
        Danhgia.setText(danhgia);

    }
}