package com.example.putin.mapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sms extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        b1 = (Button)findViewById(R.id.button28);
        b2 = (Button)findViewById(R.id.button29);
        e1 = (EditText) findViewById(R.id.editText10);
        e2 = (EditText)findViewById(R.id.editText11);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1,s2;
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.putExtra("address",s2);
                i.putExtra("sms_body",s1);
                i.setType("vnd.android-dir/mms-sms");
                startActivity(i);
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(sms.this,mainmenu.class);
                startActivity(j);
                finish();
            }
        });
    }
}
