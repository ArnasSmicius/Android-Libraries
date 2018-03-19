package com.example.arnassmicius.bolts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import bolts.Task;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Task<String> successful = Task.forResult("The good result.");

        Task<String> failed = Task.forError(new RuntimeException("An error message."));
    }
}
