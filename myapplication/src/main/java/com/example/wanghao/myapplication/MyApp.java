package com.example.wanghao.myapplication;

import android.app.Application;

/**
 * Created by WangHao on 2016/7/28.
 */
public class MyApp extends Application{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
