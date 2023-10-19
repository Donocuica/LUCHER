package com.example.launcher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.OnbordingActivity;

public class LauncherActivity extends AppCompatActivity {
    private static final String TAG = LauncherActivity.class.getSimpleName();
    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        activity = LauncherActivity.this;

        new Handler().postDelayed(() -> {
            startActivity(new Intent(LauncherActivity.this, OnbordingActivity.class));
            finish();
        }, 1000);
    }
}