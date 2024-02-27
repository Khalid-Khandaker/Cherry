package com.example.cherry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen splashScreen = SplashScreen.installSplashScreen(this);

        View content = findViewById(android.R.id.content);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

    }
}