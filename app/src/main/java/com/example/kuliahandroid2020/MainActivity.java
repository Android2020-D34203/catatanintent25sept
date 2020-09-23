package com.example.kuliahandroid2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView, textView2;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button      = findViewById(R.id.tombol);
        textView    = findViewById(R.id.teks);
        textView2   = findViewById(R.id.teks2);
        editText    = findViewById(R.id.editText);
    }

    public void gantiTeks(View v){
        String input = editText.getText().toString();

        textView.setText(input);
        textView2.setText("Ganti textview2");
    }

    public void gantiTeksKedua(View v){
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        i.putExtra("kuliah", "android 2020");
        i.putExtra("umur", 20);
        startActivity(i);
//        textView.setText("Reset dari tombol reset");
//        textView2.setText("Reset textview2");
    }

}
