package adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eecs4443lab2.R;
import com.example.eecs4443lab2.Item;

import java.util.List;

/**
 * RecyclerView Adapter that uses the ViewHolder pattern.
 * - Binds Item data (title, image, description)
 * - Exposes click events via a callback interface
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(@NonNull Item item, int position);
    }

    private final Context context;
    private final List<Item> items;
    private final OnItemClickListener clickListener;

    public ItemAdapter(@NonNull Context context,
                       @NonNull List<Item> items,
                       @NonNull OnItemClickListener clickListener) {
        this.context = context;
        this.items = items;
        this.clickListener = clickListener;
        setHasStableIds(true); // best practice for animations & performance
    }

    @Override
    public long getItemId(int position) {
        // Stable ID derived from data; here we use position for simplicity with hardcoded list
        return position;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new ItemViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = items.get(position);

        // --- Graceful fallbacks for null/missing data ---
        String safeTitle = (item.getTitle() == null || item.getTitle().trim().isEmpty())
                ? "Untitled"
                : item.getTitle();

        String safeDesc = (item.getDescription() == null || item.getDescription().trim().isEmpty())
                ? "No description available."
                : item.getDescription();

        int resId = item.getImageResId();
        if (resId == 0) {
            resId = android.R.drawable.ic_menu_report_image; // placeholder if missing
        }

        holder.titleTv.setText(safeTitle);
        holder.descTv.setText(safeDesc);

        try {
            holder.thumbIv.setImageResource(resId);
        } catch (Resources.NotFoundException e) {
            holder.thumbIv.setImageResource(android.R.drawable.ic_menu_report_image);
        }

        holder.thumbIv.setContentDescription(safeTitle);

        // Click handler via explicit callback to keep adapter generic & testable
        holder.itemView.setOnClickListener(v -> {
            int pos = holder.getBindingAdapterPosition();
            if (pos != RecyclerView.NO_POSITION) {
                clickListener.onItemClick(item, pos);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {
        final ImageView thumbIv;
        final TextView titleTv;
        final TextView descTv;

        ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            thumbIv = itemView.findViewById(R.id.item_thumb);
            titleTv = itemView.findViewById(R.id.item_title);
            descTv = itemView.findViewById(R.id.item_desc);
        }
    }
}
