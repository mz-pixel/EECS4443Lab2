/**
 * Adapter class for RecyclerView
 * Binds the data (Item objects) to the ViewHolder (UI components)
 */
package com.example.eecs4443lab2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    // Constructor initializes adapter with context and dataset
    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    // Called when a new ViewHolder needs to be created
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }

    @Override
    // Binds data to each ViewHolder
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Item item = items.get(position);

        holder.nameView.setText(items.get(position).getTitle());
        holder.emailView.setText(items.get(position).getDescription());
        holder.imageView.setImageResource(items.get(position).getImageResId());


        // Handle click on item → navigate to DetailActivity
        // TODO: Fix this to actually navigate to DetailActivity
//        holder.itemView.setOnClickListener(v -> {
//            Intent intent = new Intent(context, DetailActivity.class);
//
//            // Pass data through Intent extras
//            intent.putExtra("name", item.getName());
//            intent.putExtra("imageResId", item.getImage());
//            intent.putExtra("description", item.getDescription());
//
//            // Required when starting an Activity outside an Adapter
//            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            context.startActivity(intent);
//        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
