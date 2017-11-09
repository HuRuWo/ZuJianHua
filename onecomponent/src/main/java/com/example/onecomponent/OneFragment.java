package com.example.onecomponent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * Created by mrzhang on 2017/6/15.
 */

public class OneFragment extends Fragment {

    private View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.one_fragment, container,
                    false);
            rootView.findViewById(R.id.tv_content).setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    //UIRouter.getInstance().openUri(getActivity(), "componentdemo://share", null);
                }
            });

        }
        return rootView;
    }
}
