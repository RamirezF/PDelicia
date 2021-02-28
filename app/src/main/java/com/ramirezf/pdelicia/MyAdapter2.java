package com.ramirezf.pdelicia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.ViewHolder> {
    private List<String> promoMs;
    private int layout;
    private OnItemClickListener itemClickListener;

    public MyAdapter2(List<String> promoMs, int layout, OnItemClickListener listener)
    {
        this.promoMs = promoMs;
        this.layout = layout;
        this.itemClickListener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(promoMs.get(position), itemClickListener);
    }

    @Override
    public int getItemCount() {
        return promoMs.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewName;

        public ViewHolder(View itemView){
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.txt_pizza);
        }

        public void bind(final String promoMs, final OnItemClickListener listener){
            this.textViewName.setText(promoMs);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.OnItemClick(promoMs, getAdapterPosition());        // para ver la posición
                }
            });
        }
    }

    public interface OnItemClickListener{
        void OnItemClick(String name, int position);
    }
}
