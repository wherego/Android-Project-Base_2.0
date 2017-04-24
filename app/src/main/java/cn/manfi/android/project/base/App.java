package cn.manfi.android.project.base;

import android.app.Application;

import timber.log.Timber;

/**
 * Application
 * Created by Manfi on 2017/4/17.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
