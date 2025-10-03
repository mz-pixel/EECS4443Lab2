package com.example.eecs4443lab2;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * DetailActivity
 * - Receives data via Intent extras
 * - Displays full title, large image, and full description
 * - Handles null/missing data gracefully with sensible defaults
 */
public class DetailActivity extends AppCompatActivity {

    private TextView titleTv;
    private ImageView imageIv;
    private TextView descTv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        titleTv = findViewById(R.id.detail_title);
        imageIv = findViewById(R.id.detail_image);
        descTv = findViewById(R.id.detail_desc);

        // --- Extract intent data safely ---
        String title = getIntent().getStringExtra(MainActivity.EXTRA_TITLE);
        String desc = getIntent().getStringExtra(MainActivity.EXTRA_DESC);
        int imageResId = getIntent().getIntExtra(MainActivity.EXTRA_IMAGE_RES_ID, 0);

        // --- Graceful fallbacks ---
        if (title == null || title.trim().isEmpty()) title = "Untitled";
        if (desc == null || desc.trim().isEmpty()) desc = "No description available.";
        if (imageResId == 0) imageResId = android.R.drawable.ic_menu_report_image;

        titleTv.setText(title);
        descTv.setText(desc);

        try {
            imageIv.setImageResource(imageResId);
        } catch (Resources.NotFoundException e) {
            imageIv.setImageResource(android.R.drawable.ic_menu_report_image);
        }

        imageIv.setContentDescription(title);
        setTitle(title); // nice touch for the action bar
    }
}
