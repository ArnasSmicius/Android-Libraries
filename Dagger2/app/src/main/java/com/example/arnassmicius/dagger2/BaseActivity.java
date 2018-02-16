package com.example.arnassmicius.dagger2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by arnas on 18.2.16.
 */

public class BaseActivity extends AppCompatActivity {

    @Inject
    public SharedPreferences prefs;
    @Inject
    public Context context;
    @Inject
    public Resources res;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((DaggerApplication) getApplication()).getAppComponent().inject(this);
    }
}
