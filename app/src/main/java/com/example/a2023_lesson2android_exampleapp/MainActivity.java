package com.example.a2023_lesson2android_exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String TAG = "Testing";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate()");

        //TODO Write intent to get to Next Activity

        //TODO Write code for a Toast

        //TODO (if there's time) Add a button to activate google maps
    }

    // TODO Override the methods of the android activity life cycle


}