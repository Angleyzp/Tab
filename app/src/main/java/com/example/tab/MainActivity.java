package com.example.tab;


import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;


import androidx.fragment.app.ListFragment;

import com.example.tab.baseactivity.BaseActivity;
import com.example.tab.bean.Bean;
import com.example.tab.contract.HomeContract;
import com.example.tab.fragment.HomeFragment;
import com.example.tab.fragment.LessFragment;
import com.example.tab.persenter.HomePresenter;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<HomePresenter> implements HomeContract.IMainView, View.OnClickListener {


    private android.widget.FrameLayout frame;
    private android.widget.RadioGroup rg;
    private android.widget.RadioButton btn1;
    private android.widget.RadioButton btn2;
    private android.widget.RadioButton btn3;
    private android.widget.RadioButton btn4;
    private android.widget.RadioButton btn5;
    private HomeFragment homeFragment;
    private ArrayList<Bean.DataDTO.BannerDTO> bannerDTOS;
    private LessFragment lessFragment;

    @Override
    protected void initView() {
        frame = (FrameLayout) findViewById(R.id.frame);
        bannerDTOS = new ArrayList<>();
        rg = (RadioGroup) findViewById(R.id.rv);
        btn1 = (RadioButton) findViewById(R.id.rb_a);
        btn2 = (RadioButton) findViewById(R.id.rb_b);
        btn3 = (RadioButton) findViewById(R.id.rb_c);
        btn4 = (RadioButton) findViewById(R.id.rb_d);
        btn5 = (RadioButton) findViewById(R.id.rb_e);
        homeFragment = new HomeFragment();
        lessFragment = new LessFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame,homeFragment)
                .add(R.id.frame, lessFragment)
                .hide(lessFragment)
                .show(homeFragment)
                .commit();
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public HomePresenter getPer() {
        return new HomePresenter();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rb_a:
                getSupportFragmentManager().beginTransaction()
                        .hide(lessFragment)
                        .show(homeFragment)
                        .commit();
                break;
            case R.id.rb_b:
                getSupportFragmentManager().beginTransaction()
                        .hide(homeFragment)
                        .show(lessFragment)
                        .commit();
                break;
            case R.id.rb_c:

                break;
            case R.id.rb_d:

                break;
            case R.id.rb_e:

                break;
        }
    }

    @Override
    public void onSuccess(Bean bean) {

    }
}