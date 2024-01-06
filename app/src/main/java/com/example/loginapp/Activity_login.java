package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtAccount = findViewById(R.id.txtAccount);
        txtAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginAccount = new Intent(Activity_login.this,Activity_sign_up.class);
                startActivity(loginAccount);
            }
        });
    }
}