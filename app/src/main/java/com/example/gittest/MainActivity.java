package com.example.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Test", "This is a test");
        Log.i("Test", "This is another test");
        Log.i("Test", "This is third test");
        Log.i("Test", "This is fourth test");
        Log.i("Test", "This is fifth test");
    }
}
