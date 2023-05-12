package com.example.storyapp;

import java.util.ArrayList;

public class ListData {
    String title, page;
    int image;
    boolean isFavorite;

    ArrayList<Pages> stories = new ArrayList<Pages>();

    public ListData(String title, String page, int image, boolean isFavorite, ArrayList<Pages> stories) {
        this.title = title;
        this.page = page;
        this.image = image;
        this.isFavorite = isFavorite;
        this.stories = stories;
    }

    public boolean isFavorite() {
        return isFavorite;
    }
    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getTitle() {
        return title;
    }

    public String getPage() {
        return page;
    }

    public int getImage() {
        return image;
    }

    public ArrayList<Pages> getStories() {
        return stories;
    }
}
