package com.example.mysample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3;
    Button btn,btn1;
    Random r1,r2;
    int num,num1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.e1);
        et2 = findViewById(R.id.e2);
        et3 = findViewById(R.id.e3);
        btn = findViewById(R.id.b);
        btn1 = findViewById(R.id.b2);
        r1 =new Random();
        num =r1.nextInt(100);
        r2 =new Random();
        num1 =r2.nextInt(100);
        et1.setText(Integer.toString(num));
        et2.setText(Integer.toString(num1));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int one=Integer.parseInt(et1.getText().toString());
                int two=Integer.parseInt(et2.getText().toString());
                int c=one+two;
                et3.setText(String.valueOf(c));

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=getIntent();
                finish();
                startActivity(intent);
            }
        });
    }



}