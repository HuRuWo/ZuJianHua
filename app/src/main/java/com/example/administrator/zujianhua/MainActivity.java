package com.example.administrator.zujianhua;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.mrzhang.component.componentlib.router.Router;
import com.mrzhang.componentservice.readerbook.OneService;

public class MainActivity extends AppCompatActivity {

    private FrameLayout tabContent;

    Fragment fragment;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabContent = (FrameLayout) findViewById(R.id.tab_content);
        showFragment();
    }

    private void showFragment() {
        if (fragment != null) {
            ft = getSupportFragmentManager().beginTransaction();
            ft.remove(fragment).commit();
            fragment = null;
        }
        Router router = Router.getInstance();
        if (router.getService(OneService.class.getSimpleName()) != null) {
            OneService service = (OneService) router.getService(OneService.class.getSimpleName());
            fragment = service.getOneFragment();
            ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.tab_content, fragment).commitAllowingStateLoss();
        }
    }
}
