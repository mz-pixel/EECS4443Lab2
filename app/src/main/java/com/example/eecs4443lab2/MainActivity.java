package com.example.eecs4443lab2;

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

        // arraylist for the items so it can be displayed in list by looping over them
        itemList = new ArrayList<>();
        populateItems();

        // adapter for items
        adapter = new ItemAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }

    // hardcoding the items
    private void populateItems() {
        // testing for bulk items to see if it lags - did not
//        for (int i = 1; i <= 1500; i++) {
//            itemList.add(new Item(
//                    "Item " + i,
//                    R.drawable.placeholder,
//                    "testing item " + i
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
                "Testing long strings: Just a tomato, nothing else. Just a tomato, nothing else. Just a tomato, nothing else. Just a tomato, nothing else. Just a tomato, nothing else. Just a tomato, nothing else. Just a tomato, nothing else. Just a tomato, nothing else. Just a tomato, nothing else. Just a tomato, nothing else."
        ));

        itemList.add(new Item(
                "Watermelon",
                R.drawable.placeholder,
                "Just a juicy watermelon, ready to be eaten"
        ));

        itemList.add(new Item(
                "Pears",
                R.drawable.placeholder,
                "Get some pears before they sell out."
        ));

        itemList.add(new Item(
                "Avocado",
                R.drawable.placeholder,
                "An yummy avocado to have today"
        ));

        itemList.add(new Item(
                "Kiwi",
                R.drawable.placeholder,
                "A simple delicious fruit"
        ));

        itemList.add(new Item(
                "Carrots",
                R.drawable.placeholder,
                "Some carrots to get your vitamin A in"
        ));

        itemList.add(new Item(
                "Potato",
                R.drawable.placeholder,
                "Yummy potatoes"
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
                "Strawberries",
                R.drawable.placeholder,
                "Snack on some yummy strawberries."
        ));

        itemList.add(new Item(
                "Blueberries",
                R.drawable.placeholder,
                "Get some blueberries to eat at home."
        ));
    }
}
