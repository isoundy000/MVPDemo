package com.example.weioule.mvpdemo.model;


import android.os.Handler;

import com.example.weioule.mvpdemo.base.BaseModel;
import com.example.weioule.mvpdemo.base.Callback;
import com.example.weioule.mvpdemo.base.HttpRequest;


/**
 * Author by weioule.
 * Date on 2018/10/29.
 */
public class HomeActivityModel extends BaseModel implements HttpRequest.HttpRequestListener {


    public HomeActivityModel(Callback callback) {
        super(callback);
    }

    public void checkVersion() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                onSuccess(null);
            }
        }, 1500);
    }

    @Override
    public void onFailed(Exception e) {

    }

    @Override
    public void onSuccess(Object result) {
        callback.onSuccess(true);
    }
}
