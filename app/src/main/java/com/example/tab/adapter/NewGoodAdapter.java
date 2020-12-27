package com.example.tab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.core.widget.ListViewAutoScrollHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.bumptech.glide.Glide;
import com.example.tab.R;
import com.example.tab.bean.Bean;

import java.util.ArrayList;

public class NewGoodAdapter extends DelegateAdapter.Adapter {

    private GridLayoutHelper gridLayoutHelper;
    private Context context;
    private ArrayList<Bean.DataDTO.BrandListDTO> list;

    public NewGoodAdapter(GridLayoutHelper gridLayoutHelper, Context context, ArrayList<Bean.DataDTO.BrandListDTO> list) {
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
        View newgood = LayoutInflater.from(context).inflate(R.layout.newgood, parent, false);
        return new ViewHolder_good(newgood);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder_good viewHolder_good = (ViewHolder_good) holder;
        Glide.with(context).load(list.get(position).getPic_url()).into(viewHolder_good.good);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class ViewHolder_good extends RecyclerView.ViewHolder {

        private final ImageView good;

        public ViewHolder_good(@NonNull View itemView) {
            super(itemView);
            good = itemView.findViewById(R.id.iv_good);
        }
    }
}
