package com.phongpn.demorevycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ImageViewHolder> {
    private List<Integer> listImageId;
    private ImageViewHolder.OnClickImage listener;

    public Adapter(List<Integer> listImageId, ImageViewHolder.OnClickImage listener) {
        this.listImageId = listImageId;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, null);
        return new ImageViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.bindData(listImageId.get(position));
    }

    @Override
    public int getItemCount() {
        return listImageId.size();
    }
}
