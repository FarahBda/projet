package com.example.storyapp;

public class ListData {
    String title, page;
    int image;
    boolean isFavorite;
    public ListData(String title, String page, int image) {
        this.isFavorite = false;
        this.title = title;
        this.page = page;
        this.image = image;
    }

    public boolean isFavorite() {
        return isFavorite;
    }
    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
