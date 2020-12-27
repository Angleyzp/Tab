package com.example.tab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.bumptech.glide.Glide;
import com.example.tab.R;
import com.example.tab.bean.Bean;

import java.util.ArrayList;

public class HotAdapter extends DelegateAdapter.Adapter {
    private GridLayoutHelper gridLayoutHelper;
    private Context context;
    private ArrayList<Bean.DataDTO.NewGoodsListDTO> list;

    public HotAdapter(GridLayoutHelper gridLayoutHelper, Context context, ArrayList<Bean.DataDTO.NewGoodsListDTO> list) {
        this.gridLayoutHelper = gridLayoutHelper;
        this.context = context;
        this.list = list;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return gridLayoutHelper;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.hot_item, parent, false);
        return new Viewholder_hot(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Viewholder_hot viewholder_hot = (Viewholder_hot) holder;
        Glide.with(context).load(list.get(position).getList_pic_url()).into(viewholder_hot.hot);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class Viewholder_hot extends RecyclerView.ViewHolder {


        private final ImageView hot;

        public Viewholder_hot(@NonNull View itemView) {
            super(itemView);
            hot = itemView.findViewById(R.id.iv_hot);
        }
    }
}
