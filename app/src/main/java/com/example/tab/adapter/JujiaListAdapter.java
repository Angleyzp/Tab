package com.example.tab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.bumptech.glide.Glide;
import com.example.tab.R;

public class JujiaListAdapter extends DelegateAdapter.Adapter {
    private GridLayoutHelper gridLayoutHelper;
    private Context context;

    public JujiaListAdapter(GridLayoutHelper gridLayoutHelper, Context context) {
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
        View jujiaList = LayoutInflater.from(context).inflate(R.layout.hot_item, parent, false);
        return new JujiaListViewHolder(jujiaList);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            JujiaListViewHolder jujiaListViewHolder = (JujiaListViewHolder) holder;
        Glide.with(context).load(R.drawable.jujiaa).into(jujiaListViewHolder.iv_jujia);
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    class JujiaListViewHolder extends RecyclerView.ViewHolder {

        private final ImageView iv_jujia;

        public JujiaListViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_jujia = itemView.findViewById(R.id.iv_hot);
        }
    }
}
