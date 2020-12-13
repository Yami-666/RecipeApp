package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SignUp extends AppCompatActivity {

    private Button mCheckEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mCheckEmail = findViewById(R.id.btn_sign_up);
        mCheckEmail.setOnClickListener(v -> {
            Intent intent = new Intent(SignUp.this, CheckEmail.class);
            startActivity(intent);
        });
    }
}