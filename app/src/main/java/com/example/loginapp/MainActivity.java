package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // getSupportActionBar().hide();
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) MaterialButton login = findViewById(R.id.loginBtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginNext = new Intent(MainActivity.this,Activity_login.class);
                startActivity(loginNext);
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) MaterialButton button = findViewById(R.id.registerBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this,Activity_sign_up.class);
              startActivity(intent);
            }
        });
    }
}