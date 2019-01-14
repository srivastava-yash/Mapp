package com.example.putin.mapp;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class textTospeech extends AppCompatActivity {
    EditText t1;
    Button b1,b2;
    TextToSpeech ts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tospeech);

        t1 = (EditText)findViewById(R.id.editText6);
        b1 = (Button) findViewById(R.id.button13);
        b2 = (Button) findViewById(R.id.button14);

        ts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                ts.setLanguage(Locale.ENGLISH);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = t1.getText().toString();

                ts.speak(s, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(textTospeech.this, mainmenu.class);
                startActivity(i);
                finish();
            }
        });
    }
}