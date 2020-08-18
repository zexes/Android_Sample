package com.zikozee.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    final String TAG = "ACTIVITY_DEMO";
    private TextView mTextView;

    //This is where we take care of core business logic...
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Following line Brings view on top of the Activity
        setContentView(R.layout.activity_main); //This is related to view

        mTextView = findViewById(R.id.textView);
        Button pushMe = findViewById(R.id.pushMeButton);
        Button pushMe2 = findViewById(R.id.pushMeButton2);

        pushMe.setOnClickListener(this);// we use this here since MainActivity now Implements the Viw.OnclickListener hence control delegated to it. as we implemented below based on the implemented method
        pushMe2.setOnClickListener(this);
//        pushMe.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Log.d(TAG, "Somebody pushed me");
//                textView.setText("Somebody definitely pushed the Button");
////                textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
//            }
//        });
//
//        pushMe2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Log.d(TAG, "Somebody pushed me 2");
//                textView.setText("Somebody definitely pushed the Button 2");
////                textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
//            }
//        });

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

    // Better approach, All control of Buttons will be here
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.pushMeButton:
                Log.d(TAG, "Somebody pushed me");
                mTextView.setText("Somebody definitely pushed the Button");
                break;
            case R.id.pushMeButton2:
                Log.d(TAG, "Somebody pushed me 2");
                mTextView.setText("Somebody definitely pushed the Button 2");
                break;

            default:
                Log.d(TAG, "Nothing happened");
        }

    }
}