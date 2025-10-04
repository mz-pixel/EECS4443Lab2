/**
 * Detail screen that shows full item information when clicked from list
 */


package com.example.eecs4443lab2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail); // Layout for detail screen

        // Bind views
        TextView titleTv = findViewById(R.id.detail_title);
        TextView descTv = findViewById(R.id.detail_desc);
        ImageView imageView = findViewById(R.id.detail_image);

        // Retrieve data passed via Intent
        // TODO: Fix this to actually retrieve data
//        String title = getIntent().getStringExtra("title");
//        String description = getIntent().getStringExtra("description");
//        int imageResId = getIntent().getIntExtra("imageResId", R.drawable.placeholder);

        // Populate UI with item data
//        titleTv.setText(title);
//        descTv.setText(description);
//        imageView.setImageResource(imageResId);
    }
}
