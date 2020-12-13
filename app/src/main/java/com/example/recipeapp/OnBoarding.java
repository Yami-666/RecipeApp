package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;

public class OnBoarding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        Button mBtnGetStarted = findViewById(R.id.btn_get_started);
        mBtnGetStarted.setOnClickListener(v -> {
            Intent intent = new Intent(OnBoarding.this, SignIn.class);
            startActivity(intent);
        });

    }
}