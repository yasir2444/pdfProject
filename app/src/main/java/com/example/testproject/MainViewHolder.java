package com.example.testproject;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    public TextView txt;
    public CardView cardView;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        txt=itemView.findViewById(R.id.pdf_name);
        cardView=itemView.findViewById(R.id.pdf_card);
    }
}
