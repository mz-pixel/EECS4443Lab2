package com.example.eecs4443lab2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    // stores context and the data list to display
    private Context context;
    private List<Item> itemList;


    // constructor
    public ItemAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }


    // item view holder which holds reference to the child view
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new ItemViewHolder(view);
    }

    // binds data to corresponding positions
    @Override
    public void onBindViewHolder( ItemViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.title.setText(item.getTitle());

        // code to limit the description to 50 characters if it is longer
        // (mentioned in the lab report to have short description on list page)
        String desc = item.getDescription();
        if (desc.length() > 50) {
            desc = desc.substring(0, 50) + "...";
        }
        holder.summary.setText(desc);
        holder.thumbnail.setImageResource(item.getImageResId());

        // event listener for each item in the list, onClick it creates intent and
        // passes necessary data to the detail activity and start the activity
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("title", item.getTitle());
            intent.putExtra("imageResId", item.getImageResId());
            intent.putExtra("description", item.getDescription());
            context.startActivity(intent);
        });
    }

    // returns list size, necessary function to implement
    @Override
    public int getItemCount() {
        return itemList.size();
    }

    // view holder which holds the references to the individual views, helps in recycler view
    // so that you can avoid calling findViewById each time and just reuse what is stored
    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView title, summary;
        ImageView thumbnail;

        public ItemViewHolder( View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.item_title);
            summary = itemView.findViewById(R.id.item_summary);
            thumbnail = itemView.findViewById(R.id.item_image);
        }
    }
}
