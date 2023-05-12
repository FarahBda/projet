package com.example.storyapp;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class PagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    ListData dataArrayList;
    Context context;
    LayoutInflater layoutInflater;


    public PagerAdapter(ListData dataArrayList, Context context) {
        this.dataArrayList = dataArrayList;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dataArrayList.getStories().size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view=layoutInflater.inflate(R.layout.pager_item,container,false);

        ImageView img = view.findViewById(R.id.imgPage);
        img.setImageResource(dataArrayList.getStories().get(position).imagePage);
        TextView txt = view.findViewById(R.id.detailName);
        txt.setText(dataArrayList.getStories().get(position).textPage);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((View)object);
    }
}
