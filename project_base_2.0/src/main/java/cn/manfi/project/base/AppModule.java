package cn.manfi.project.base;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjection;

/**
 * Application Moudule
 * Created by Manfi on 2017/4/21.
 */

@Module
public class AppModule {

    Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return application;
    }
}
