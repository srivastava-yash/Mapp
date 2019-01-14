package com.example.putin.mapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class mainmenu extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        Log.e("hello","welcome here");
       b1= (Button)findViewById(R.id.button4);
        b2= (Button)findViewById(R.id.button5);
        b3= (Button)findViewById(R.id.button6);
        b4= (Button)findViewById(R.id.button7);
        b5= (Button)findViewById(R.id.button8);
        b6= (Button)findViewById(R.id.button9);
        b7= (Button)findViewById(R.id.button10);
        b8= (Button)findViewById(R.id.button11);
        b9= (Button)findViewById(R.id.button12);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(mainmenu.this,textTospeech.class);
                startActivity(z);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(mainmenu.this,web.class);
                startActivity(b);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(mainmenu.this,mediaplayer.class);
                startActivity(c);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(mainmenu.this,camera.class);
                startActivity(d);
                finish();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(mainmenu.this,light.class);
                startActivity(f);
                finish();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(mainmenu.this,sms.class);
                startActivity(f);
                finish();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(mainmenu.this,calculator.class);
                startActivity(f);
                finish();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g = new Intent(mainmenu.this,MainActivity.class);
                startActivity(g);
                finish();
            }
        });
    }




}
