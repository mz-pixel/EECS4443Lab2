/**
 * Main screen that displays the RecyclerView list of items
 */
package com.example.eecs4443lab2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * MainActivity
 * - Creates 15 hardcoded Item objects
 * - Wires RecyclerView with ItemAdapter
 * - On click, launches DetailActivity via explicit Intent passing title, imageResId, description
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Main layout containing RecyclerView

        // Initialize RecyclerView
        // RecyclerView for displaying list
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Vertical scrolling list

        // Initialize data list
        // Data source
        List<Item> itemList = new ArrayList<>();

        // Populate with dummy data (15 hardcoded items as required by lab)
        for (int i = 1; i <= 2; i++) {
            itemList.add(new Item("Item " + i, R.drawable.image_placeholder, "Description for item " + i));
        }

        // Create adapter and attach it to RecyclerView
        // Adapter for RecyclerView
        MyAdapter adapter = new MyAdapter(getApplicationContext(), itemList);
        recyclerView.setAdapter(adapter);
    }
}