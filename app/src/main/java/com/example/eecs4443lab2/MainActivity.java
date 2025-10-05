package com.example.eecs4443lab2;
//
//import android.os.Bundle;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//    }
//}

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // creates a divider then adds it to the recycler view so that it is displayed after each item
        DividerItemDecoration divider = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(divider);

        itemList = new ArrayList<>();
        populateItems();

        adapter = new ItemAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }

    private void populateItems() {
//        for (int i = 1; i <= 1500; i++) {
//            itemList.add(new Item(
//                    "Item " + i,
//                    R.drawable.placeholder,   // add placeholder.png in drawable
//                    "This is the description for Item " + i
//            ));
//        }
        itemList.add(new Item(
                "Banana",
                R.drawable.placeholder,
                "Just a Banana, nothing else."
        ));

        itemList.add(new Item(
                "Apple",
                R.drawable.placeholder,
                "Just an apple, nothing else."
        ));

        itemList.add(new Item(
                "Orange",
                R.drawable.placeholder,
                "Just an Orange, nothing else."
        ));

        itemList.add(new Item(
                "Pineapple",
                R.drawable.placeholder,
                "Just a Pineapple, nothing else."
        ));

        itemList.add(new Item(
                "Tomato",
                R.drawable.placeholder,
                "Just a tomato, nothing else."
        ));

        itemList.add(new Item(
                "Something",
                R.drawable.placeholder,
                "Out of ideas already."
        ));

        itemList.add(new Item(
                "Pencils",
                R.drawable.placeholder,
                "why is there an image of a pencil here you ask? I dont know."
        ));

        itemList.add(new Item(
                "Sky",
                R.drawable.placeholder,
                "Blue sky."
        ));

        itemList.add(new Item(
                "Clouds",
                R.drawable.placeholder,
                "This cloud is very cool (just imagine there is a cloud here and not a placeholder image)."
        ));

        itemList.add(new Item(
                "Grass",
                R.drawable.placeholder,
                "Please touch some grass..."
        ));

        itemList.add(new Item(
                "River",
                R.drawable.placeholder,
                "river...."
        ));

        itemList.add(new Item(
                "Grapes",
                R.drawable.placeholder,
                "I guess we going back to fruits now."
        ));

        itemList.add(new Item(
                "Mango",
                R.drawable.placeholder,
                "Best fruit after lemons."
        ));

        itemList.add(new Item(
                R.drawable.placeholder
        ));

        itemList.add(new Item());
    }
}
