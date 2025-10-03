package com.example.eecs4443lab2;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;

public class Item {
    @Nullable
    private final String title;
    @DrawableRes
    private final int imageResId;
    @Nullable
    private final String description;

    public Item(@Nullable String title, int imageResId, @Nullable String description) {
        this.title = title;
        this.imageResId = imageResId;
        this.description = description;
    }

    @Nullable
    public String getTitle() {
        return title;
    }

    @DrawableRes
    public int getImageResId() {
        return imageResId;
    }

    @Nullable
    public String getDescription() {
        return description;
    }
}
