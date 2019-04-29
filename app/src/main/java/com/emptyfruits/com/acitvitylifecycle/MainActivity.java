package com.emptyfruits.com.acitvitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    public static final String DATA_KEY = "COUNTER";
    private Button button;
    private TextView counterView;
    private int counter = 0;

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart() called");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop() called");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy() called");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart() called");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause() called");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume() called");
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        counterView = findViewById(R.id.counter_tv);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterView.setText(String.valueOf(++counter));
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(DATA_KEY, counter);
                startActivity(intent);
            }
        });
        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt(DATA_KEY);
            counterView.setText(String.valueOf(counter));
        }
        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt(DATA_KEY, counter);
        Log.d(TAG, "onSaveInstanceState() called with: outState = [" + outState + "] ");
        super.onSaveInstanceState(outState);
    }
}

