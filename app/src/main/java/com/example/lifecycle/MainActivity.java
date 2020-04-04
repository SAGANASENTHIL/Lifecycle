package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG =MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"In method onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"In method onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"In method onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"In method onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"In method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"In method onDestroy");
    }
}
