package com.example.tab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.example.tab.R;

public class RenQiAdapter extends DelegateAdapter.Adapter {
    private SingleLayoutHelper singleLayoutHelper;
    private Context context;

    public RenQiAdapter(SingleLayoutHelper singleLayoutHelper, Context context) {
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
        View renqi = LayoutInflater.from(context).inflate(R.layout.hottitle, parent, false);
        return new RenqiViewHolder(renqi);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RenqiViewHolder renqiViewHolder = (RenqiViewHolder) holder;
        renqiViewHolder.renqi.setText("人气推荐");
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class RenqiViewHolder extends RecyclerView.ViewHolder {

        private final TextView renqi;

        public RenqiViewHolder(@NonNull View itemView) {
            super(itemView);
            renqi = itemView.findViewById(R.id.tv_title);
        }
    }
}
