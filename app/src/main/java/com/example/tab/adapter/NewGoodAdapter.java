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
import com.example.tab.R;

public class NewGoodAdapter extends DelegateAdapter.Adapter {

    private GridLayoutHelper gridLayoutHelper;
    private Context context;

    public NewGoodAdapter(GridLayoutHelper gridLayoutHelper, Context context) {
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
        View newgood = LayoutInflater.from(context).inflate(R.layout.newgood, parent, false);
        return new ViewHolder_good(newgood);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
    class ViewHolder_good extends RecyclerView.ViewHolder {

        private final ImageView good;

        public ViewHolder_good(@NonNull View itemView) {
            super(itemView);
            good = itemView.findViewById(R.id.iv_good);
        }
    }
}
