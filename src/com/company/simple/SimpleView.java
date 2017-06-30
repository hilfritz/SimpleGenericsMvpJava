package com.company.simple;

import com.company.LogUtil;

import java.util.ArrayList;

/**
 * Created by herdmacbook1 on 29/6/17.
 */
public class SimpleView implements SimpleViewInterface {
    public static final String TAG = "SimpleView";

    public SimpleView() {
        LogUtil.log(TAG, "constructor(): ");
    }

    @Override
    public void initializeViews() {
        LogUtil.log(TAG, "initializeViews(): ");
    }

    @Override
    public void showLoading() {
        LogUtil.log(TAG, "showLoading(): showing loading");
    }

    @Override
    public void hideLoading() {
        LogUtil.log(TAG, "showLoading(): hiding loading");
    }


    @Override
    public void showList(ArrayList<String> list) {
        LogUtil.log(TAG, "showLoading(): showing list:");
        for(int x = 0;x < list.size(); x++){
            String message = list.get(x);
            LogUtil.log(TAG, "showLoading(): list item: "+message);
        }
        LogUtil.log(TAG, "showLoading(): showing list end");
    }
}
