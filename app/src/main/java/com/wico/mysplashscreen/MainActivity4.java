package com.wico.mysplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent c = new Intent(MainActivity4.this, MainActivity5.class);

                startActivity(c);
            }
        },1000);
    }
}