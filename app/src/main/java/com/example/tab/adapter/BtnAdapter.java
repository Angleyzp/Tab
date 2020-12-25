package com.example.tab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.example.tab.R;

public class BtnAdapter extends DelegateAdapter.Adapter {
    private SingleLayoutHelper singleLayoutHelper;
    private Context context;

    public BtnAdapter(SingleLayoutHelper singleLayoutHelper, Context context) {
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
        View btn = LayoutInflater.from(context).inflate(R.layout.btn_item, parent, false);
        return new ViewHolder_btn(btn);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class ViewHolder_btn extends RecyclerView.ViewHolder {

        private final Button btna;
        private final Button btnb;
        private final Button btnc;
        private final Button btnd;
        private final Button btne;

        public ViewHolder_btn(@NonNull View itemView) {
            super(itemView);
            btna = itemView.findViewById(R.id.btn_a);
            btnb = itemView.findViewById(R.id.btn_b);
            btnc = itemView.findViewById(R.id.btn_c);
            btnd = itemView.findViewById(R.id.btn_d);
            btne = itemView.findViewById(R.id.btn_e);
        }
    }
}
