package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewsHolder extends RecyclerView.ViewHolder {


    public TextView title;
    public TextView pTime;
    public ImageView imageView;

    public NewsHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.news_summary_title_tv);
        pTime = itemView.findViewById(R.id.news_summary_ptime_tv);
        imageView = itemView.findViewById(R.id.news_summary_photo);
     }
}
