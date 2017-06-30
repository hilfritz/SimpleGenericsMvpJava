package com.company;

import com.company.simple.SimplePresenter;
import com.company.simple.SimpleView;

public class Main {

    public static void main(String[] args) {

        SimpleView simpleView = new SimpleView();

        SimplePresenter<SimpleView> simplePresenter = new SimplePresenter<>(simpleView);
        simplePresenter.init();
        simplePresenter.populate();
        simplePresenter.destroy();



    }
}
