package com.example.mygroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splech_screen extends AppCompatActivity {
    private static int splash_time=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splech_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(splech_screen.this, MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },splash_time);


        }
    }
