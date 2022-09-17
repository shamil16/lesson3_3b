package com.example.lesson3_3b;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ColorAdapter extends RecyclerView.Adapter<ColorViewHolder> {
    public void setColorList(ArrayList<String> colorList) {
        this.colorList = colorList;
    }

    private ArrayList<String> colorList;


    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ColorViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.colors_name,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ColorViewHolder holder, int position) {
        holder.bind(colorList.get(position));
    }

    @Override
    public int getItemCount() {
        return colorList.size();
    }
}