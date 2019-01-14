package com.example.putin.mapp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        b1 = (Button) findViewById(R.id.button3);
        b2 = (Button) findViewById(R.id.button30);
        e1 = (EditText) findViewById(R.id.editText3);
        e2 = (EditText) findViewById(R.id.editText4);
        e3 = (EditText) findViewById(R.id.editText5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1,s2,s3;
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();
                s3 = e3.getText().toString();

                SQLiteDatabase data = openOrCreateDatabase("db",MODE_PRIVATE,null);
                data.execSQL("create table if not exists details(name varchar, email varchar, password varchar)");
                String s = "SELECT * FROM details where name='"+s1+"' and password='"+s3+"'";
                Cursor c = data.rawQuery(s,null);
                if(c.getCount()>0)
                {
                    Toast.makeText(register.this,"User already exist",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    data.execSQL("insert into details values('"+s1+"','"+s2+"','"+s3+"')");
                    Intent i = new Intent(register.this,MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(register.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
