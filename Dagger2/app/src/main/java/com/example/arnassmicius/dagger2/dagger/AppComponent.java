package com.example.arnassmicius.dagger2.dagger;

import com.example.arnassmicius.dagger2.BaseActivity;
import com.example.arnassmicius.dagger2.DaggerApplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by arnas on 18.2.16.
 */

@Singleton @Component(modules = { AppModule.class }) public interface AppComponent {

    void inject(DaggerApplication application);

    void inject(BaseActivity baseActivity);
}
