package com.example.tab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.bumptech.glide.Glide;
import com.example.tab.R;

public class JuJiaTitleAdapter extends DelegateAdapter.Adapter {
    private SingleLayoutHelper singleLayoutHelper;
    private Context context;

    public JuJiaTitleAdapter(SingleLayoutHelper singleLayoutHelper, Context context) {
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
        View jujia = LayoutInflater.from(context).inflate(R.layout.newtitle, parent, false);
        return new JujiaViewHolder(jujia);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            JujiaViewHolder jujiaViewHolder = (JujiaViewHolder) holder;
           jujiaViewHolder.tv_titlr.setText("居家");
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class JujiaViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv_titlr;

        public JujiaViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_titlr = itemView.findViewById(R.id.tv_title);
        }
    }
}
