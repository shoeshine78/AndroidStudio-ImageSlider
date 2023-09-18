package com.wico.mysplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent f = new Intent(MainActivity7.this, MainActivity8.class);

                startActivity(f);
            }
        },1000);
    }
}