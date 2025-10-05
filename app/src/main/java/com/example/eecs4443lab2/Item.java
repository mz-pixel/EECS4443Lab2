package com.example.eecs4443lab2;

public class Item {

//    class variables
    String title = "Did not find Title";
    int imageResId = R.drawable.placeholder;
    String description = "There was no description found";

    // used android studio's generator to generate the constructor and get/set methods

    public Item(String title, int imageResId, String description) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        }
        if (imageResId != 0) {
            this.imageResId = imageResId;
        }
        if (description != null && !description.trim().isEmpty()) {
            this.description = description;
        }
    }
    public Item(String title) {
        this(title, 0, null); // only title
    }

    public Item(int imageResId) {
        this(null, imageResId, null); // only image
    }

    public Item(String title, String description) {
        this(title, 0, description); // title + desc
    }

    public Item() {
        this(null,0,null);
    }

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
