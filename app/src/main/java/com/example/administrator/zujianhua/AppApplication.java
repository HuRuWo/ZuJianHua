package com.example.administrator.zujianhua;

import android.app.Application;

import com.mrzhang.component.componentlib.router.Router;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //如果isRegisterCompoAuto为false，则需要通过反射加载组件
        Router.registerComponent("com.example.onecomponent.applike.OneAppLike");

        //Router.registerComponent("com.example.twocomponent.applike.TwoAppLike");

    }


}
