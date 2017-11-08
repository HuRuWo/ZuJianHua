package com.example.onecomponent.serviceimpl;

import android.support.v4.app.Fragment;

import com.example.onecomponent.OneFragment;
import com.mrzhang.componentservice.readerbook.OneService;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class ReadBookServiceImpl implements OneService {
    @Override
    public Fragment getOneFragment() {
        return new OneFragment();
    }
}
