package com.example.tab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.bumptech.glide.Glide;
import com.example.tab.R;

public class RenqiListAdapter extends DelegateAdapter.Adapter {
    private GridLayoutHelper gridLayoutHelper;
    private Context context;

    public RenqiListAdapter(GridLayoutHelper gridLayoutHelper, Context context) {
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
        View inflate = LayoutInflater.from(context).inflate(R.layout.renqiitem, parent, false);
        return new RenqiListViewHGolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RenqiListViewHGolder renqiListViewHGolder = (RenqiListViewHGolder) holder;
        Glide.with(context).load(R.drawable.renqi).into(renqiListViewHGolder.iv_renqi);
    }

    @Override
    public int getItemCount() {
        return 3;
    }
    class RenqiListViewHGolder extends RecyclerView.ViewHolder {

        private final ImageView iv_renqi;

        public RenqiListViewHGolder(@NonNull View itemView) {
            super(itemView);
            iv_renqi = itemView.findViewById(R.id.iv_renqi);

        }
    }
}
