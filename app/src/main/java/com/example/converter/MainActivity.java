package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button pls;
    Button min;
    Button mul;
    Button div;
    Button pow;
    Button clr;
    Button km;
    Button mile;
    EditText basenumber1;
    EditText basenumber2;
    TextView answer;
    final Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pls = findViewById(R.id.button_plus);
        min = findViewById(R.id.button_minus);
        mul = findViewById(R.id.button_mul);
        div = findViewById(R.id.button_div);
        pow = findViewById(R.id.button_pow);
        clr = findViewById(R.id.clr);
        km = findViewById(R.id.km);
        mile = findViewById(R.id.mile);
        answer =  findViewById(R.id.answer);
        basenumber1 =  findViewById(R.id.a0);
        basenumber2 =  findViewById(R.id.a1);


        pls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(basenumber1.getText().toString());
                float num2 = Float.parseFloat(basenumber2.getText().toString());
                float Ans = num1 + num2;
                answer.setText(String.valueOf(Ans));

            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(basenumber1.getText().toString());
                float num2 = Float.parseFloat(basenumber2.getText().toString());
                float Ans = num1 - num2;
                answer.setText(String.valueOf(Ans));

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(basenumber1.getText().toString());
                float num2 = Float.parseFloat(basenumber2.getText().toString());
                float Ans = num1 * num2;
                answer.setText(String.valueOf(Ans));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(basenumber1.getText().toString());
                float num2 = Float.parseFloat(basenumber2.getText().toString());
                float Ans = num1 / num2;
                answer.setText(String.valueOf(Ans));

            }
        });

        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(basenumber1.getText().toString());
                float num2 = Float.parseFloat(basenumber2.getText().toString());
                float Ans = (float) Math.pow(num1, num2);
                answer.setText(String.valueOf(Ans));

            }
        });

        km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,convertx.class);
                startActivity(intent);

            }

        });
        mile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,convertx.class);
                startActivity(intent);

            }

        });

    }

}
