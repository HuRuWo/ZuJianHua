package com.example.onecomponent.applike;

import com.example.onecomponent.serviceimpl.OneServiceImpl;
import com.mrzhang.component.componentlib.applicationlike.IApplicationLike;
import com.mrzhang.component.componentlib.router.Router;
import com.mrzhang.componentservice.readerbook.OneService;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class OneAppLike implements IApplicationLike {

    Router router = Router.getInstance();

    @Override
    public void onCreate() {
        //注入
        router.addService(OneService.class.getSimpleName(), new OneServiceImpl());
    }

    @Override
    public void onStop() {
        //移除
        router.removeService(OneService.class.getSimpleName());
    }
}
