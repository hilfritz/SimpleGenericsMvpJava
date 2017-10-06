package com.company.simple;

import com.company.base.BaseViewInterface;

import java.util.ArrayList;

/**
 * Created by herdmacbook1 on 30/6/17.
 */
public interface SimpleViewInterface extends BaseViewInterface {
    void init(SimplePresenter presenter);
    void showList(ArrayList<String> list);
    void onRefreshClick();
}
