package com.example.oneonecomponent.applike;

import com.example.oneonecomponent.compouirouter.OneOneUIRouter;
import com.example.oneonecomponent.serviceimpl.OneOneServiceImpl;
import com.mrzhang.component.componentlib.applicationlike.IApplicationLike;
import com.mrzhang.component.componentlib.router.Router;
import com.mrzhang.component.componentlib.router.ui.UIRouter;
import com.mrzhang.componentservice.readerbook.OneOneService;
import com.mrzhang.componentservice.readerbook.OneService;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class OneOneApplike implements IApplicationLike {

    //Router router = Router.getInstance();
    UIRouter uiRouter = UIRouter.getInstance();
    OneOneUIRouter shareUIRouter = OneOneUIRouter.getInstance();

    @Override
    public void onCreate() {
        //注入
        //router.addService(OneOneService.class.getSimpleName(), new OneOneServiceImpl());
        uiRouter.registerUI(shareUIRouter);
    }

    @Override
    public void onStop() {
        //移除
        //router.removeService(OneOneService.class.getSimpleName());
        uiRouter.unregisterUI(shareUIRouter);
    }
}
