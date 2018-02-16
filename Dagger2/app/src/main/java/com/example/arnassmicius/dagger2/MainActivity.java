package com.example.arnassmicius.dagger2;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.tv_text_view_1);

        Log.d(TAG, "onCreate: Before the change Number is : " + prefs.getInt("Number", 0));
        int number = prefs.getInt("Number", 0);
        prefs.edit().putInt("Number", number * 2).apply();
        Log.d(TAG, "onCreate: The value of Number is : " + prefs.getInt("Number", 0));

        textView1.setBackgroundColor(res.getColor(android.R.color.holo_red_dark));
    }
}
