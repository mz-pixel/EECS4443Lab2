/**
 * ViewHolder Class for RecyclerView
 * Responsible for caching the child views of the item layout
 */
package com.example.eecs4443lab2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder  extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView, emailView;

    // Constructor binds the views using itemView (root layout of the item)
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        // Initialize view references (must match IDs in item_view.xml)
        nameView = itemView.findViewById(R.id.title);
        imageView = itemView.findViewById(R.id.Imageview);
        emailView = itemView.findViewById(R.id.description);

    }

}
