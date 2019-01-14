package com.example.putin.mapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mediaplayer extends AppCompatActivity {
    Button b1,b2,b3,b4;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediaplayer);

        b1= (Button)findViewById(R.id.button15);
        b2= (Button)findViewById(R.id.button16);
        b3= (Button)findViewById(R.id.button17);
        b4= (Button)findViewById(R.id.button18);
        mp = MediaPlayer.create(this,R.raw.song);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mediaplayer.this, mainmenu.class);
                startActivity(i);
                finish();
            }
        });
    }
}
