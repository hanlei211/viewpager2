package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsListAdapter extends RecyclerView.Adapter<NewsHolder> {
    List<NewsBean> newsBeans;
    Context mContext;
    public NewsListAdapter(Context mContext,List<NewsBean> newsBeanList){
        this.newsBeans = newsBeanList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public NewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return  new NewsHolder(LayoutInflater.from(mContext).inflate(R.layout.item_news_photo,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NewsHolder holder, int position) {
        holder.title.setText(newsBeans.get(position).title);
        holder.pTime.setText(newsBeans.get(position).passtime);
        holder.imageView.setImageResource(R.drawable.ic_launcher_background);
    }

    @Override
    public int getItemCount() {
        return newsBeans == null ? 0 : newsBeans.size();
    }
}
