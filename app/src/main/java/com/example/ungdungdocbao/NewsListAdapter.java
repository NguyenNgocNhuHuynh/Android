package com.example.ungdungdocbao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class NewsListAdapter extends RecyclerView.Adapter<NewsListAdapter.NewsViewHolder> {
    private final LinkedList<News> newsList;
    private LayoutInflater mInflater;
    public NewsListAdapter(Context context, LinkedList<News> newsList) {
        mInflater=LayoutInflater.from(context);
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView=mInflater.inflate(R.layout.list_news,parent,false);
        return new NewsViewHolder(mItemView,this);

    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        News mCurrent = newsList.get(position);
        holder.mTitle.setText(mCurrent.getTitle().toString());
        holder.mDesciption.setText(mCurrent.getMota().toString());

    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder{
        private final ImageView img;
        private final TextView mTitle;
        private final TextView mDesciption;
        final NewsListAdapter mAdapter;
        public NewsViewHolder(@NonNull View itemView, NewsListAdapter mAdapter) {
            super(itemView);
            this.img=itemView.findViewById(R.id.img_main);
            this.mTitle=itemView.findViewById(R.id.txt_tieude);
            this.mDesciption=itemView.findViewById(R.id.txt_mota);
            this.mAdapter = mAdapter;
        }
    }
}
