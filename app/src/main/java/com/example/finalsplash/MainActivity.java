package com.example.finalsplash;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);

        super.onCreate(savedInstanceState);
        MediaPlayer appIntro;
        appIntro = MediaPlayer.create(MainActivity.this,R.raw.app_intro);
        appIntro.start();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, HomePage.class);
                startActivity(i);
                appIntro.stop();
                finish();
            }
        }, 5000);
    }
}
        
       
    
