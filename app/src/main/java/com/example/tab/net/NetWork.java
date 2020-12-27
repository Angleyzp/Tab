package com.example.tab.net;

public interface NetWork {
    public <T> void getLogin(String url,CallBackinterface<T> callBack);
}
