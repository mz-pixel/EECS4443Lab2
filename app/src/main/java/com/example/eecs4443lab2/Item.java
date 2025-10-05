package com.example.eecs4443lab2;

public class Item {

//    class variables
    String title = "No Title";
    int imageResId = R.drawable.placeholder;
    String description = "No description found";

    // used android studio's generator to generate the constructor and get/set methods

    public Item(String title, int imageResId, String description) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            this.title = "No Title";
        }
        if (imageResId > 0) {
            this.imageResId = imageResId;
        } else {
            this.imageResId = R.drawable.placeholder1;
        }
        if (description != null && !description.trim().isEmpty()) {
            this.description = description;
        } else {
            this.description = "No description found";
        }
    }

    // constructors below handle scenarios where certain params are missing.
    public Item(String title) {
        this(title, -1, null);
    }

    public Item(int imageResId) {
        this(null, imageResId, null);
    }

    public Item(String title, String description) {
        this(title, -1, description);
    }

    public Item() {
        this(null,-1,null);
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
