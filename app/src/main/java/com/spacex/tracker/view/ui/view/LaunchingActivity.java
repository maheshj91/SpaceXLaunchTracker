package com.spacex.tracker.view.ui.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.spacex.tracker.databinding.ActivityLaunchBinding;

public class LaunchingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLaunchBinding binding = ActivityLaunchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            startActivity(new Intent(LaunchingActivity.this, MainActivity.class));
            finish();
        }, 3000);
    }
}
