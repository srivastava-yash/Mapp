package com.example.putin.mapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class web extends AppCompatActivity {
    Button b1,b2;
    EditText e1;
    WebView w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        b1 = (Button)findViewById(R.id.button24);
        b2 = (Button)findViewById(R.id.button25);
        e1 = (EditText)findViewById(R.id.editText9);
        w = (WebView)findViewById(R.id.webView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = e1.getText().toString();
                w.loadUrl(s);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(web.this,mainmenu.class);
                startActivity(i);
                finish();
            }
        });
    }
}

