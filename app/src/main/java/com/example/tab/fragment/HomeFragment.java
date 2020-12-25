package com.example.tab.fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.example.tab.R;
import com.example.tab.adapter.BannerAdapter;
import com.example.tab.adapter.SearchAdapter;

public class HomeFragment extends Fragment {

    private RecyclerView rv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView(getView());
    }

    private void initView(View view) {
        rv = view.findViewById(R.id.rv);
        //创建Vlayout布局管理器
        VirtualLayoutManager manager = new VirtualLayoutManager(getContext());
        //创建服复用池
        RecyclerView.RecycledViewPool pool = new RecyclerView.RecycledViewPool();
        //绑定布局管理器
        rv.setRecycledViewPool(pool);
        //设置复用池的大小
        pool.setMaxRecycledViews(0,10);



        //第一行布局
        SingleLayoutHelper singleLayoutHelper = new SingleLayoutHelper();
        // 公共属性
        // 设置布局里Item个数
        singleLayoutHelper.setItemCount(1);
        // 设置LayoutHelper的子元素相对LayoutHelper边缘的距离
        singleLayoutHelper.setPadding(20, 20, 20, 20);
        // 设置LayoutHelper边缘相对父控件（即RecyclerView）的距离
        singleLayoutHelper.setMargin(20, 20, 20, 20);
        // 设置背景颜色
        singleLayoutHelper.setBgColor(Color.LTGRAY);
        // 设置设置布局内每行布局的宽与高的比
        singleLayoutHelper.setAspectRatio(11);
        //设置第一行布局适配器
        SearchAdapter searchAdapter = new SearchAdapter(singleLayoutHelper,getContext());

        //第二行布局
        SingleLayoutHelper singleLayoutHelper_banner = new SingleLayoutHelper();
        // 公共属性
        // 设置布局里Item个数
        singleLayoutHelper_banner.setItemCount(1);
        // 设置LayoutHelper的子元素相对LayoutHelper边缘的距离
        singleLayoutHelper_banner.setPadding(20, 20, 20, 20);
        // 设置LayoutHelper边缘相对父控件（即RecyclerView）的距离
        singleLayoutHelper_banner.setMargin(20, 20, 20, 20);
        // 设置背景颜色
        singleLayoutHelper_banner.setBgColor(Color.LTGRAY);
        // 设置设置布局内每行布局的宽与高的比
        singleLayoutHelper_banner.setAspectRatio(11);
        //设置第二行布局适配器
        BannerAdapter bannerAdapter = new BannerAdapter(singleLayoutHelper_banner,getContext());





        //创建适配器包
        DelegateAdapter adapter = new DelegateAdapter(manager,true);
        //添加适配器
        adapter.addAdapter(searchAdapter);//第一行
        //绑定布局管理器
        rv.setLayoutManager(manager);
        //绑定适配器
        rv.setAdapter(adapter);
    }
}