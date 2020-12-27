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
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.example.tab.R;
import com.example.tab.adapter.BannerAdapter;
import com.example.tab.adapter.BtnAdapter;
import com.example.tab.adapter.HotAdapter;
import com.example.tab.adapter.HottitleAdapter;
import com.example.tab.adapter.NewGoodAdapter;
import com.example.tab.adapter.NewTitleAdapter;
import com.example.tab.adapter.RenQiAdapter;
import com.example.tab.adapter.RenqiListAdapter;
import com.example.tab.adapter.SearchAdapter;
import com.example.tab.adapter.ZhuanTiAdapter;
import com.example.tab.adapter.ZhuanTiListAdapter;

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
        rv.setFocusableInTouchMode(false);
        //创建Vlayout布局管理器
        VirtualLayoutManager manager = new VirtualLayoutManager(getContext());
        //创建服复用池
        RecyclerView.RecycledViewPool pool = new RecyclerView.RecycledViewPool();
        //绑定布局管理器
        rv.setRecycledViewPool(pool);
        //设置复用池的大小
        pool.setMaxRecycledViews(0,20);



        //第一行布局
        SingleLayoutHelper singleLayoutHelper = new SingleLayoutHelper();
        // 公共属性
        // 设置布局里Item个数
        singleLayoutHelper.setItemCount(1);
        // 设置LayoutHelper的子元素相对LayoutHelper边缘的距离
        singleLayoutHelper.setPadding(10, 10, 10, 10);
        // 设置背景颜色
        singleLayoutHelper.setBgColor(Color.CYAN);
        // 设置设置布局内每行布局的宽与高的比
        singleLayoutHelper.setAspectRatio(11);
        //设置第一行布局适配器
        SearchAdapter searchAdapter = new SearchAdapter(singleLayoutHelper,getContext());

        //第二行布局
        SingleLayoutHelper singleLayoutHelper_banner = new SingleLayoutHelper();
        // 公共属性
        // 设置布局里Item个数
        singleLayoutHelper_banner.setItemCount(1);
        //设置第二行布局适配器
        BannerAdapter bannerAdapter = new BannerAdapter(singleLayoutHelper_banner,getContext());


        //第三行布局
        SingleLayoutHelper singleLayoutHelper_btn = new SingleLayoutHelper();
        // 公共属性
        // 设置布局里Item个数
        singleLayoutHelper_btn.setItemCount(1);
        // 设置LayoutHelper的子元素相对LayoutHelper边缘的距离
        singleLayoutHelper_btn.setPadding(25, 25, 25, 25);
        //设置第三行布局适配器
        BtnAdapter btnAdapter = new BtnAdapter(singleLayoutHelper_btn, getContext());

        //第四行布局
        SingleLayoutHelper singleLayoutHelper_Newtitle = new SingleLayoutHelper();
        // 公共属性
        // 设置布局里Item个数
        singleLayoutHelper_Newtitle.setItemCount(1);
        //设置第四行布局适配器
        HottitleAdapter hottitleAdapter = new HottitleAdapter(singleLayoutHelper_Newtitle, getContext());


        //第五行布局
        GridLayoutHelper hottitle = new GridLayoutHelper(2);
        // 公共属性
        // 设置布局里Item个数
        hottitle.setItemCount(2);
        //设置第五行布局适配器
        NewGoodAdapter newGoodAdapter = new NewGoodAdapter(hottitle, getContext());


        //第六行布局
        SingleLayoutHelper singleLayoutHelper_Hottitle = new SingleLayoutHelper();
        // 公共属性
        // 设置布局里Item个数
        singleLayoutHelper_Hottitle.setItemCount(1);
        //设置第六行布局适配器
        NewTitleAdapter newTitleAdapter = new NewTitleAdapter(singleLayoutHelper_Hottitle, getContext());


        //第七行布局
        GridLayoutHelper newhelper = new GridLayoutHelper(2);
        // 公共属性
        // 设置布局里Item个数
        newhelper.setItemCount(2);
        //设置第七行布局适配器
        HotAdapter hotAdapter = new HotAdapter(newhelper, getContext());


        //第八行布局
        SingleLayoutHelper singleLayoutHelper_renqi = new SingleLayoutHelper();
        // 公共属性
        // 设置布局里Item个数
        singleLayoutHelper_renqi.setItemCount(1);
        //设置第八行布局适配器
        RenQiAdapter renQiAdapter = new RenQiAdapter(singleLayoutHelper_renqi, getContext());

        //第九行布局
        GridLayoutHelper RenqiListhelper = new GridLayoutHelper(1);
        // 公共属性
        // 设置布局里Item个数
        RenqiListhelper.setItemCount(2);
        //设置第九行布局适配器
        RenqiListAdapter renqiListAdapter = new RenqiListAdapter(RenqiListhelper, getContext());


        //第十行布局
        SingleLayoutHelper singleLayoutHelper_zhuanti = new SingleLayoutHelper();
        // 公共属性
        // 设置布局里Item个数
        singleLayoutHelper_zhuanti.setItemCount(1);
        //设置第十行布局适配器
        ZhuanTiAdapter zhuanTiAdapter = new ZhuanTiAdapter(singleLayoutHelper_zhuanti, getContext());




        //第十一行布局
        GridLayoutHelper zhuanti = new GridLayoutHelper(1);
        // 公共属性
        // 设置布局里Item个数
        RenqiListhelper.setItemCount(1);
        //设置第十一行布局适配器
        ZhuanTiListAdapter zhuanTiListAdapter = new ZhuanTiListAdapter(zhuanti, getContext());


        //创建适配器包
        DelegateAdapter adapter = new DelegateAdapter(manager,false);
        //添加适配器
        adapter.addAdapter(searchAdapter);//第一行
        adapter.addAdapter(bannerAdapter);//第二行
        adapter.addAdapter(btnAdapter);//第三行
        adapter.addAdapter(hottitleAdapter);//第四行
        adapter.addAdapter(newGoodAdapter);//第五行
        adapter.addAdapter(newTitleAdapter);//第六行
        adapter.addAdapter(hotAdapter);//第七行
        adapter.addAdapter(renQiAdapter);//第八行
        adapter.addAdapter(renqiListAdapter);//第九行
        adapter.addAdapter(zhuanTiAdapter);//第十行
        adapter.addAdapter(zhuanTiListAdapter);//第十行

        //绑定布局管理器
        rv.setLayoutManager(manager);
        //绑定适配器
        rv.setAdapter(adapter);
    }
}