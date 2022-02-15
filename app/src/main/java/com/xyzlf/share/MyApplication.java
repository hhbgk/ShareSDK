package com.xyzlf.share;

import android.app.Application;

public class MyApplication extends Application {
    private static MyApplication sMyApplication = null;
    @Override
    public void onCreate() {
        super.onCreate();
        sMyApplication = this;
    }

    public static MyApplication getAppContext() {
        return sMyApplication;
    }
}
