package com.example.storyapp;

public class Pages {
    int imagePage;
    String textPage;

    public Pages(int imagePage, String textPage) {
        this.imagePage = imagePage;
        this.textPage = textPage;
    }

    public int getImagePage() {
        return imagePage;
    }

    public void setImagePage(int imagePage) {
        this.imagePage = imagePage;
    }

    public String getTextPage() {
        return textPage;
    }

    public void setTextPage(String textPage) {
        this.textPage = textPage;
    }
}
