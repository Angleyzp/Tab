package com.example.tab.modle;


import com.example.tab.contract.HomeContract;
import com.example.tab.net.CallBackinterface;
import com.example.tab.net.RetrofitUtils;

public class HomeModel implements HomeContract.IMainModel {

    private HomeContract.IMainPresenter homePresenter;

    public HomeModel(HomeContract.IMainPresenter homePresenter) {

        this.homePresenter = homePresenter;
    }


    @Override
    public <T> void getLoginData(String newlist, CallBackinterface<T> beanCallBackinterface) {
        RetrofitUtils.getInstance().getLogin(newlist,beanCallBackinterface);
    }
}
