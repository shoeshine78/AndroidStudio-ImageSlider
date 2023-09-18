package com.wico.mysplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent d = new Intent(MainActivity5.this, MainActivity6.class);

                startActivity(d);
            }
        },1000);
    }
}