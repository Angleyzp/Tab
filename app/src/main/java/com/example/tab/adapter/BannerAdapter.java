package com.example.tab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.example.tab.R;
import com.youth.banner.Banner;

public class BannerAdapter extends DelegateAdapter.Adapter {
    private SingleLayoutHelper singleLayoutHelper;
    private Context context;

    public BannerAdapter(SingleLayoutHelper singleLayoutHelper, Context context) {
        this.singleLayoutHelper = singleLayoutHelper;
        this.context = context;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return singleLayoutHelper;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View banner = LayoutInflater.from(context).inflate(R.layout.banneritem, parent, false);
        return new BannerViewHolder(banner);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }
    class BannerViewHolder extends RecyclerView.ViewHolder {
        private final Banner banenr;
        public BannerViewHolder(@NonNull View itemView) {
            super(itemView);
            banenr = itemView.findViewById(R.id.banner);
        }
    }
}
