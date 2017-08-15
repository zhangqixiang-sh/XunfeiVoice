package com.zqx.kedaxunfei;

import android.app.Application;

import com.iflytek.cloud.SpeechUtility;

/**
 * Created by ZhangQixiang on 2017/1/6.
 */
public class App extends Application {

    private static final String APPID = "appid=586d1a59";
    @Override
    public void onCreate() {
        super.onCreate();
        SpeechUtility.createUtility(this, APPID);

    }
}
