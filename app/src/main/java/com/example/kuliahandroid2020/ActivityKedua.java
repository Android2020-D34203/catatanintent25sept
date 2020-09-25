package com.example.kuliahandroid2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        textView = findViewById(R.id.textView);

        Intent i            = getIntent();

        String kiriman      = i.getStringExtra("teskirim");
        int angkakiriman    = i.getIntExtra("tesangka", 0);
        float ipkkiriman    = i.getFloatExtra("ipk", 0f);

        textView.setText(String.valueOf(kiriman));
    }
}