package com.hilfritz.mvp.simple;

import com.hilfritz.mvp.LogUtil;
import com.hilfritz.mvp.base.BasePresenterInterface;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by herdmacbook1 on 29/6/17.
 * shortcut to implementing class: cmd+alt+b - https://stackoverflow.com/questions/5051766/intellij-idea-jump-from-interface-to-implementing-class-in-java
 * error 1: https://stackoverflow.com/questions/23688702/cannot-start-compilation-the-output-path-is-not-specified-for-module
 */
public class SimplePresenter<V extends SimpleViewInterface> implements BasePresenterInterface
{
    private static final String TAG = "presenter";
    private V view;

    public SimplePresenter(V view) {
        LogUtil.log(TAG, "constructor(): ");
        setView(view);
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

    public void setView(V view){
        this.view = view;
    }

    public ArrayList<String> getSampleData(){
        LogUtil.log(TAG, "getSampleData(): retrieving data");
        return new ArrayList<>(Arrays.asList("LIST ITEM A", "LIST ITEM B", "LIST ITEM C","LIST ITEM D"));
    }
}
