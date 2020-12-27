package com.example.tab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.bumptech.glide.Glide;
import com.example.tab.R;
import com.example.tab.bean.Bean;

import java.util.ArrayList;

public class RenqiListAdapter extends DelegateAdapter.Adapter {
    private GridLayoutHelper gridLayoutHelper;
    private Context context;
    private ArrayList<Bean.DataDTO.HotGoodsListDTO> list;

    public RenqiListAdapter(GridLayoutHelper gridLayoutHelper, Context context, ArrayList<Bean.DataDTO.HotGoodsListDTO> list) {
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
        View inflate = LayoutInflater.from(context).inflate(R.layout.renqiitem, parent, false);
        return new RenqiListViewHGolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RenqiListViewHGolder renqiListViewHGolder = (RenqiListViewHGolder) holder;
        Glide.with(context).load(list.get(position).getList_pic_url()).into(renqiListViewHGolder.iv_renqi);
        renqiListViewHGolder.tv_desc.setText(list.get(position).getName());
        renqiListViewHGolder.tv_price.setText(list.get(position).getRetail_price());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class RenqiListViewHGolder extends RecyclerView.ViewHolder {

        private final ImageView iv_renqi;
        private final TextView tv_desc;
        private final TextView tv_price;

        public RenqiListViewHGolder(@NonNull View itemView) {
            super(itemView);
            iv_renqi = itemView.findViewById(R.id.iv_renqi);
            tv_desc = itemView.findViewById(R.id.tv_desc);
            tv_price = itemView.findViewById(R.id.tv_price);

        }
    }
}
