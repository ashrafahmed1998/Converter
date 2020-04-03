package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class convertx extends AppCompatActivity {

    Button km;
    Button mile;
    EditText basenumber1;
    TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertx);

        km = findViewById(R.id.km);
        mile= findViewById(R.id.mile);
        basenumber1=findViewById(R.id.basenumber1);
        result= findViewById(R.id.result);

        km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float kilometer = Float.parseFloat(basenumber1.getText().toString());
                float Mle = (float) (kilometer*0.62);
                result.setText(String.valueOf(Mle));
            }
        });

        mile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float Miles = Float.parseFloat(basenumber1.getText().toString());
                float kmtr = (float) (Miles*1.61);
                result.setText(String.valueOf(kmtr));
            }
        });

    }
}
