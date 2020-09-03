package com.example.applicationcdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconde);
        Log.e("\tETAT","ON CREATE");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("\tETAT","ON RESUME");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("\tETAT","ON START");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("\tETAT","ON PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("\tETAT","ON STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("\tETAT","ON DESTROY");
    }
}
