package com.example.arnassmicius.dagger2;

import android.app.Application;

import com.example.arnassmicius.dagger2.dagger.AppComponent;
import com.example.arnassmicius.dagger2.dagger.AppModule;
import com.example.arnassmicius.dagger2.dagger.DaggerAppComponent;

/**
 * Created by arnas on 18.2.16.
 */

public class DaggerApplication extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();

        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
