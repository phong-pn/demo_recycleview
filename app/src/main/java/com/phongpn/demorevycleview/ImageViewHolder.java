package com.phongpn.demorevycleview;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ImageViewHolder extends RecyclerView.ViewHolder {
    interface OnClickImage {
        void onClick(int id);
    }

    private OnClickImage listener;

    public ImageViewHolder(@NonNull View itemView, OnClickImage listener) {
        super(itemView);
        this.listener = listener;
    }

    public void bindData(int idImage) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(idImage);
            }
        });
        Glide.with(itemView)
                .load(idImage)
                .fitCenter()
                .into((ImageView) itemView.findViewById(R.id.image));
    }
}
