package com.example.oneonecomponent.serviceimpl;

import android.support.v4.app.Fragment;

import com.example.oneonecomponent.OneOneFragment;
import com.mrzhang.componentservice.readerbook.OneOneService;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class OneOneServiceImpl implements OneOneService {
    @Override
    public Fragment getOneFragment() {
        return new OneOneFragment();
    }
}
