package com.example.arnassmicius.dagger2.dagger;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;

import com.example.arnassmicius.dagger2.DaggerApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by arnas on 18.2.16.
 */

@Module public class AppModule {

    private final DaggerApplication application;

    public AppModule(DaggerApplication app) {
        this.application = app;
    }

    @Provides @Singleton Context providesApplicationContext() {
        return application;
    }


    @Provides @Singleton SharedPreferences providesSharedPreferences(Context app) {
        return app.getSharedPreferences("My_Prefs_Title", Context.MODE_PRIVATE);
    }

    @Provides
    Resources providesResources() {
        return application.getResources();
    }
}
