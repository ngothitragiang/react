package com.example.recyclerapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHoder> {
    List<Integer> arrayNumber = new ArrayList<Integer>();


    public NumberAdapter(MainActivity mainActivity, List<Integer> arrayNumber) {
        this.arrayNumber = arrayNumber;
    }
    @NonNull
    @Override
    public NumberViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_number, parent, false);
        return new NumberViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHoder holder, int position) {
     holder.tvTitle.setText("ABC"+position);
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    class NumberViewHoder extends RecyclerView.ViewHolder{
        TextView tvTitle;

        public NumberViewHoder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.text_title);
        }
    }
}
