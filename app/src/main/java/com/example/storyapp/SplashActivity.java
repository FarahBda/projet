package com.example.storyapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
     ImageView logo;
     ImageView splashImage;
     TextView appName;
    private static final int SPLASH_TIMEOUT = 2000; // 2 secondes

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        logo = findViewById(R.id.logo);
        splashImage = findViewById(R.id.img);
        appName = findViewById(R.id.app_name);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //animation
        logo.animate().translationY(4000).setDuration(1000).setStartDelay(2000);
        appName.animate().translationY(4000).setStartDelay(1000).setStartDelay(2000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, 3000);
    }
}
