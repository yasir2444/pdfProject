package com.example.testproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.io.File;
import java.util.List;

public class MainAdaptor extends RecyclerView.Adapter<MainViewHolder> {
    private Context context;
    private List<File> pdffiles;

    public MainAdaptor(Context context, List<File> pdffiles) {
        this.context = context;
        this.pdffiles = pdffiles;
    }

    @NonNull

    @Override
    public MainViewHolder onCreateViewHolder(@NonNull  ViewGroup viewGroup, int i) {
        return new MainViewHolder(LayoutInflater.from(context).inflate(R.layout.pdf_menu,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder mainViewHolder, int i) {
     mainViewHolder.txt.setText(pdffiles.get(i).getName());
     mainViewHolder.txt.setSelected(true);
    }

    @Override
    public int getItemCount() {
        return pdffiles.size();
    }
}
