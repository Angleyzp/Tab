package com.example.tab.persenter;


import com.example.tab.baseactivity.BasePresenter;
import com.example.tab.bean.Bean;
import com.example.tab.contract.HomeContract;
import com.example.tab.modle.HomeModel;
import com.example.tab.net.CallBackinterface;
import com.example.tab.net.URLConstant;

public class HomePresenter extends BasePresenter<HomeContract.IMainView,HomeContract.IMainModel> implements HomeContract.IMainPresenter {

    @Override
    public HomeContract.IMainModel getiModel() {
        return new HomeModel(this);
    }

    @Override
    public void getData() {
        iModel.getLoginData(URLConstant.NEWLIST, new CallBackinterface<Bean>() {
            @Override
            public void onSuccess(Bean bean) {
                iView.onSuccess(bean);
            }

            @Override
            public void onFail(String s) {

            }
        });
    }

}
