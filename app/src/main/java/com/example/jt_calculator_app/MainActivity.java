package com.example.jt_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int first = 0;
    int second = 0;

    public void setFirst() {
        EditText first_number = findViewById(R.id.first_number);

        if (!first_number.getText().toString().equals("")) {
            first = Integer.parseInt(first_number.getText().toString());
        }
    }

    public void setSecond() {
        EditText second_number = findViewById(R.id.second_number);

        if (!second_number.getText().toString().equals("")) {
            second = Integer.parseInt(second_number.getText().toString());
        }
    }

    public void addFunction(View view) {
        setFirst();
        setSecond();
        goToCalcOut("+");
    }

    public void subtractFunction(View view) {
        setFirst();
        setSecond();
        goToCalcOut("-");
    }

    public void multiplyFunction(View view) {
        setFirst();
        setSecond();
        goToCalcOut("*");
    }

    public void divideFunction(View view) {
        setFirst();
        setSecond();
        goToCalcOut("/");
    }

    public void goToCalcOut(String s) {
        Intent intent = new Intent(this, calc_out.class);
        int out = 0;
        switch (s) {
            case "+":
                out = first + second;
                break;
            case "-":
                out = first - second;
                break;
            case "*":
                out = first * second;
                break;
            case "/":
                out = first / second;
                break;
        }
        intent.putExtra("answer",out);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}