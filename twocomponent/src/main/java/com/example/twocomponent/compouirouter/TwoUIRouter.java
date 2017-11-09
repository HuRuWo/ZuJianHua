package com.example.twocomponent.compouirouter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

import com.example.twocomponent.TwoActivity;
import com.mrzhang.component.componentlib.router.ui.IComponentRouter;

/**
 * Created by mrzhang on 2017/6/20.
 */

public class TwoUIRouter implements IComponentRouter {

    private static final String SCHME = "component";

    private static final String SHAREHOST = "two";

    private static String[] HOSTS = new String[]{SHAREHOST};

    private static TwoUIRouter instance = new TwoUIRouter();

    private TwoUIRouter() {

    }

    public static TwoUIRouter getInstance() {
        return instance;
    }

    @Override
    public boolean openUri(Context context, String url, Bundle bundle) {
        if (TextUtils.isEmpty(url) || context == null) {
            return true;
        }
        return openUri(context, Uri.parse(url), bundle);
    }

    @Override
    public boolean openUri(Context context, Uri uri, Bundle bundle) {
        if (uri == null || context == null) {
            return true;
        }
        String host = uri.getHost();
        if (SHAREHOST.equals(host)) {
            Intent intent = new Intent(context, TwoActivity.class);
            intent.putExtras(bundle == null ? new Bundle() : bundle);
            context.startActivity(intent);
            return true;
        }
        return false;
    }

    @Override
    public boolean verifyUri(Uri uri) {
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if (SCHME.equals(scheme)) {
            for (String str : HOSTS) {
                if (str.equals(host)) {
                    return true;
                }
            }
        }
        return false;
    }
}
