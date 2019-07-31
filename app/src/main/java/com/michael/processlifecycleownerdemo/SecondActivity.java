package com.michael.processlifecycleownerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 方便我们测试，多个Activity时候，应用程序进入前台或者后台，对应用程序的生命周期是否有影响
 * */
public class SecondActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
