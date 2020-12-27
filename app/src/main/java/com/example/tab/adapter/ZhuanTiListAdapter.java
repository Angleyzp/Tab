package com.example.tab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.XmlRes;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.bumptech.glide.Glide;
import com.example.tab.R;

public class ZhuanTiListAdapter extends DelegateAdapter.Adapter {
    private GridLayoutHelper gridLayoutHelper;
    private Context context;

    public ZhuanTiListAdapter(GridLayoutHelper gridLayoutHelper, Context context) {
        this.gridLayoutHelper = gridLayoutHelper;
        this.context = context;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return gridLayoutHelper;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View zhuan = LayoutInflater.from(context).inflate(R.layout.zhuanti_item, parent, false);
        return new ZhuanViewHolder(zhuan);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            ZhuanViewHolder zhuanViewHolder = (ZhuanViewHolder) holder;
            Glide.with(context).load(R.drawable.zhuanti).into(zhuanViewHolder.iv_zhuan);
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class ZhuanViewHolder extends RecyclerView.ViewHolder {


        private final ImageView iv_zhuan;

        public ZhuanViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_zhuan = itemView.findViewById(R.id.iv_zhuan);
        }
    }
}
