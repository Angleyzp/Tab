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
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.bumptech.glide.Glide;
import com.example.tab.R;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

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
            BannerViewHolder bannerViewHolder = (BannerViewHolder) holder;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(R.drawable.a);
        list.add(R.drawable.aa);
        list.add(R.drawable.b);
        list.add(R.drawable.bb);
        bannerViewHolder.banenr.setImages(list);
        bannerViewHolder.banenr.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(context).load(path).into(imageView);
            }
        });
        bannerViewHolder.banenr.start();

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
