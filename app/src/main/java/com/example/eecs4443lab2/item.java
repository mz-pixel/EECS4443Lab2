package com.example.eecs4443lab2;
public class Item {

    // name and email of each item
    String title, description;

    // Id of the image attached ot the item
    int imageResId;

    // Main Constructor for each item
    public Item(String title, int imageResId, String description) {
        this.title = title;
        this.description = description;
        this.imageResId = imageResId;
    }


    // Getters and Setters for each item's data
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
