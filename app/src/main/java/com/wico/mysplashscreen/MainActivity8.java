package com.wico.mysplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent g = new Intent(MainActivity8.this, MainActivity9.class);

                startActivity(g);
            }
        },1000);
    }
}