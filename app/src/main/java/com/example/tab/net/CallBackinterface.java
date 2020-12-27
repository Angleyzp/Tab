package com.example.tab.net;

public interface CallBackinterface<T> {
    void onSuccess(T t);
    void onFail(String s);
}
