package com.hilfritz.mvp.simple;

import com.hilfritz.mvp.base.BaseViewInterface;

import java.util.ArrayList;

/**
 * Created by herdmacbook1 on 30/6/17.
 */
public interface SimpleViewInterface{
	void showLoading();
    void hideLoading();
    void initializeViews();
    void init(SimplePresenter<SimpleViewInterface> presenter);
    void showList(ArrayList<String> list);
    void onRefreshClick();
}
