package com.example.tab.contract;


import com.example.tab.baseactivity.BaseModel;
import com.example.tab.baseactivity.BaseView;
import com.example.tab.bean.Bean;
import com.example.tab.net.CallBackinterface;

public class HomeContract {
    public interface IMainView extends BaseView {

        void onSuccess(Bean bean);

    }
    public interface IMainPresenter{


        void getData();
    }
    public interface IMainModel extends BaseModel {
        <T>void getLoginData(String newlist, CallBackinterface<T> beanCallBackinterface);
    }
}
