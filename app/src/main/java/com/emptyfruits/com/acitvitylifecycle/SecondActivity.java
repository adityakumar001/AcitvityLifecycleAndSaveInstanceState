package com.emptyfruits.com.acitvitylifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String TAG = "SecondActivity";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "onCreate() is called");
        textView = findViewById(R.id.textView);
        textView.setText(String.valueOf(getIntent()
                .getIntExtra(MainActivity.DATA_KEY, 0)));
    }

}
