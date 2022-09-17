package com.example.lesson3_3b;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ColorViewHolder extends RecyclerView.ViewHolder {
private TextView colors;
    public ColorViewHolder(@NonNull View itemView) {
        super(itemView);
        colors=itemView.findViewById(R.id.tv_colors);
    }
    public void bind(String songName){
        colors.setText(songName);
    }
}
