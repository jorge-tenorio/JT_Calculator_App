package com.example.jt_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class calc_out extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_out);

        textView2 = findViewById(R.id.textView2);
        Intent intent = getIntent();
        int str = intent.getIntExtra("answer", 0);
        textView2.setText("Answer: " + str);
    }
}