package com.company.simple;

import com.company.LogUtil;
import com.company.base.BasePresenterInterface;
import com.company.base.BaseViewInterface;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by herdmacbook1 on 29/6/17.
 */
public class SimplePresenter<V extends SimpleViewInterface> implements BasePresenterInterface
{
    private static final String TAG = "presenter";
    private V view;

    public SimplePresenter(V view) {
        LogUtil.log(TAG, "constructor(): ");
        this.view = view;
        init();
    }

    @Override
    public void init() {
        LogUtil.log(TAG, "init(): ");
        getView().initializeViews();
    }

    @Override
    public void populate() {
        LogUtil.log(TAG, "populate(): start");
        ArrayList<String> sampleData = getSampleData();
        getView().showList(sampleData);
        LogUtil.log(TAG, "populate(): end");
    }

    @Override
    public void destroy() {
        LogUtil.log(TAG, "destroy():");
    }

    public V getView() {
        return view;
    }

    public ArrayList<String> getSampleData(){
        LogUtil.log(TAG, "getSampleData(): retrieving data");
        return new ArrayList<>(Arrays.asList("LIST ITEM A", "LIST ITEM B", "LIST ITEM C","LIST ITEM D"));
    }
}
