package com.company.base;

/**
 * Created by herdmacbook1 on 30/6/17.
 */
public interface BasePresenterInterface<V extends BaseViewInterface> {
    void init();
    void populate();
    void destroy();
}
