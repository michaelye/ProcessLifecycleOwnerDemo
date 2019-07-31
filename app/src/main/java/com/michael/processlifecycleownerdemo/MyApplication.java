package com.michael.processlifecycleownerdemo;

import android.app.Application;
import android.arch.lifecycle.ProcessLifecycleOwner;

public class MyApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new ApplicationObserver());
    }
}
