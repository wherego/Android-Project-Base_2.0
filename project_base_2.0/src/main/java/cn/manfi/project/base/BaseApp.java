package cn.manfi.project.base;

import android.app.Application;
import android.content.Context;

/**
 * BaseAppcalition
 * Created by Manfi on 2017/4/17.
 */

public class BaseApp extends Application {

    private static BaseApp app;

    public static Context getAppContext() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}
