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
import com.example.tab.bean.Bean;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

public class BannerAdapter extends DelegateAdapter.Adapter {
    private SingleLayoutHelper singleLayoutHelper;
    private Context context;
    private ArrayList<Bean.DataDTO.BannerDTO> list;

    public BannerAdapter(SingleLayoutHelper singleLayoutHelper, Context context, ArrayList<Bean.DataDTO.BannerDTO> list) {
        this.singleLayoutHelper = singleLayoutHelper;
        this.context = context;
        this.list = list;
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
        bannerViewHolder.banenr.setImages(list);
        bannerViewHolder.banenr.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Bean.DataDTO.BannerDTO lode = (Bean.DataDTO.BannerDTO) path;
                Glide.with(context).load(lode.getImage_url()).into(imageView);
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
