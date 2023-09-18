package com.wico.mysplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent h = new Intent(MainActivity9.this, MainActivity10.class);

                startActivity(h);
            }
        },1000);
    }
}