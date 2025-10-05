package com.example.eecs4443lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // get layout and create the screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // get the elements and store them in vars
        TextView title = findViewById(R.id.detail_title);
        ImageView image = findViewById(R.id.detail_image);
        TextView description = findViewById(R.id.detail_desc);

        // get the intent
        String itemTitle = getIntent().getStringExtra("title");
        int imageResId = getIntent().getIntExtra("imageResId", -1);
        String itemDescription = getIntent().getStringExtra("description");


        // incase some values are missing, fill them with default values
        // and set the element values to the values from intent
        if (itemTitle != null) {
            title.setText(itemTitle);
        } else {
            title.setText("No title found");
        }
        if (imageResId != -1) {
            image.setImageResource(imageResId);
        } else {
            image.setImageResource(R.drawable.placeholder1);
        }
        if (itemDescription != null) {
            description.setText(itemDescription);
        } else {
            description.setText("No description found");
        }
    }
}
