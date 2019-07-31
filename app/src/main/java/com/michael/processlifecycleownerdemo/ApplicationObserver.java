package com.michael.processlifecycleownerdemo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

public class ApplicationObserver implements LifecycleObserver
{
    private String TAG = this.getClass().getName();

    public ApplicationObserver()
    {

    }

    /**
     * ON_CREATE 在应用程序的整个生命周期中只会被调用一次
     * */
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate()
    {
        Log.d(TAG, "Lifecycle.Event.ON_CREATE");
    }

    /**
     * 应用程序出现到前台时调用
     * */
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart()
    {
        Log.d(TAG, "Lifecycle.Event.ON_START");
    }

    /**
     * 应用程序出现到前台时调用
     * */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume()
    {
        Log.d(TAG, "Lifecycle.Event.ON_RESUME");
    }

    /**
     * 应用程序退出到后台时调用
     * */
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause()
    {
        Log.d(TAG, "Lifecycle.Event.ON_PAUSE");
    }

    /**
     * 应用程序退出到后台时调用
     * */
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop()
    {
        Log.d(TAG, "Lifecycle.Event.ON_STOP");
    }

    /**
     * 永远不会被调用到，系统不会分发调用ON_DESTROY事件
     * */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy()
    {
        Log.d(TAG, "Lifecycle.Event.ON_DESTROY");
    }
}
