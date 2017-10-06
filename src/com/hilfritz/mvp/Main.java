package com.hilfritz.mvp;


import com.hilfritz.mvp.simple.SimplePresenter;
import com.hilfritz.mvp.simple.SimpleView;
import com.hilfritz.mvp.simple.SimpleViewInterface;

public class Main {

    public static void main(String[] args) {
        //INITIALIZE VIEW
        SimpleViewInterface simpleView = new SimpleView();
        //INITIALIZE THE PRESENTER
        SimplePresenter<SimpleViewInterface> simplePresenter = new SimplePresenter<>(simpleView);
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
