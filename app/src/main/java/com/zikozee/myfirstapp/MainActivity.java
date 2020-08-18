package com.zikozee.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    final String TAG = "ACTIVITY_DEMO";

    //This is where we take care of core business logic...
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Following line Brings view on top of the Activity
        setContentView(R.layout.activity_main); //This is related to view

        Button pushMe = findViewById(R.id.pushMeButton);


        

        Log.d(TAG, "in onCreate");
//        Log.e(TAG, "in onCreate");
//        Log.w(TAG, "in onCreate");
//        Log.i(TAG, "in onCreate");
//        Log.v(TAG, "in onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "in onResume");
    }

    @Override
    protected void onPause() {// Temporary data should be stored here
        super.onPause();
        Log.d(TAG, "in onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "in onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "in onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "in onDestroy");
    }
}