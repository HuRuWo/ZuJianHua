package com.example.twocomponent.applike;

import com.example.twocomponent.compouirouter.TwoUIRouter;
import com.mrzhang.component.componentlib.applicationlike.IApplicationLike;
import com.mrzhang.component.componentlib.router.ui.UIRouter;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class TwoApplike implements IApplicationLike {

    UIRouter uiRouter = UIRouter.getInstance();
    TwoUIRouter shareUIRouter = TwoUIRouter.getInstance();

    @Override
    public void onCreate() {
        uiRouter.registerUI(shareUIRouter);
    }

    @Override
    public void onStop() {
        uiRouter.unregisterUI(shareUIRouter);
    }
}
