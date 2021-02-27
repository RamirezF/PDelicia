package com.ramirezf.pdelicia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ramirezf.pdelicia.activities.MenuActivity;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<CartaM> cartaMs;
    private int layout;
    private OnItemClickListener itemClickListener;

    public MyAdapter(List<CartaM> cartaMs, int layout, OnItemClickListener listener)
    {
        this.cartaMs = cartaMs;
        this.layout = layout;
        this.itemClickListener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);           // Inflar la vista
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(cartaMs.get(position), itemClickListener);
    }

    @Override
    public int getItemCount() {
        return cartaMs.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewName;
        public TextView textViewDescription;
        public ImageView imageViewPizza;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.txt_pizza);
            imageViewPizza = itemView.findViewById(R.id.imagePizza);
            textViewDescription = itemView.findViewById(R.id.txt_description);

        }

        public void bind(final CartaM cartaM, final OnItemClickListener listener)
        {
            textViewName.setText(cartaM.getNameP());
            imageViewPizza.setImageResource(cartaM.getImgP());
            textViewDescription.setText(cartaM.getDescription());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.OnItemFriscoClick(cartaM, getAdapterPosition());
                }
            });
        }
    }

    public interface OnItemClickListener {
        void OnItemFriscoClick(CartaM cartaM, int position);
    }

}
