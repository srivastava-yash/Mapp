package com.example.putin.mapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity implements View.OnClickListener {

    EditText e1, e2;
    TextView t1;
    Button b1, b2, b3, b4, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        e1 = (EditText)findViewById(R.id.editText7);
        e2 = (EditText)findViewById(R.id.editText8);
        t1 = (TextView)findViewById(R.id.textView);

        b1 = (Button)findViewById(R.id.button19);
        b2 = (Button)findViewById(R.id.button20);
        b3 = (Button)findViewById(R.id.button21);
        b4 = (Button)findViewById(R.id.button22);
        b6 = (Button)findViewById(R.id.button23);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b6.setOnClickListener(this);


    }




    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button19) {

            String s1 = e1.getText().toString();
            String s2 = e2.getText().toString();
            int a, b, c;
            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);
            c = a + b;

            t1.setText(" " + c);
        }


        if (v.getId() == R.id.button20) {
            String s1 = e1.getText().toString();
            String s2 = e2.getText().toString();
            int a, b, c;
            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);
            c = a - b;

            t1.setText(" " + c);
        }

        if (v.getId() == R.id.button21) {
            String s1 = e1.getText().toString();
            String s2 = e2.getText().toString();
            int a, b, c;
            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);
            c = a * b;

            t1.setText(" " + c);
        }

        if (v.getId() == R.id.button22) {
            String s1 = e1.getText().toString();
            String s2 = e2.getText().toString();
            int a, b, c;
            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);
            c = a / b;

            t1.setText(" " + c);
        }


        if (v.getId() == R.id.button23) {
            Intent f = new Intent(calculator.this, mainmenu.class);
            startActivity(f);
            finish();
        }
    }
}
