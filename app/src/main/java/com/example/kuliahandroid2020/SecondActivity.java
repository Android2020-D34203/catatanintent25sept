package com.example.kuliahandroid2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);

        Bundle b = getIntent().getExtras();
        String kuliah = b.getString("kuliah");
        int umur = b.getInt("umur");

        textView.setText(String.valueOf(umur));
    }
}
