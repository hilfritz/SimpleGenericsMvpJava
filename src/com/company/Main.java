package com.company;

import com.company.simple.SimplePresenter;
import com.company.simple.SimpleView;

public class Main {

    public static void main(String[] args) {
        //INITIALIZE VIEW
        SimpleView simpleView = new SimpleView();
        //INITIALIZE THE PRESENTER
        SimplePresenter<SimpleView> simplePresenter = new SimplePresenter<>(simpleView);
        //SET THE VIEW'S PRESENTER
        simpleView.init(simplePresenter);

        //POPULATE THE VIEW
        simplePresenter.init();
        simplePresenter.populate();

        //TRIGGER REFRESH FROM VIEW
        simpleView.onRefreshClick();
        //HERE THE POPULATE() SHOULD BE CALLED

        //DESTROY
        simplePresenter.destroy();
    }

}
