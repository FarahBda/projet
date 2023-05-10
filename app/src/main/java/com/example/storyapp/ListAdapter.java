package com.example.storyapp;
import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListAdapter extends ArrayAdapter<ListData> {
    public ListAdapter(@NonNull Context context, ArrayList<ListData> dataArrayList) {
        super(context, R.layout.list_item, dataArrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        ListData listData = getItem(position);
        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView listImage = view.findViewById(R.id.listImage);
        TextView listTitle = view.findViewById(R.id.listTitle);
        TextView listPage = view.findViewById(R.id.listPage);

        final ImageView favoriteIcon = view.findViewById(R.id.button);

        listImage.setImageResource(listData.image);
        listTitle.setText(listData.title);
        listPage.setText(listData.page);

        ImageButton imageButton = view.findViewById(R.id.nextButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),DetailedActivity.class);
                intent.putExtra("name",listData.title);
                getContext().startActivity(intent);
            }
        });

        // Set favorite icon based on list data
        if (listData.isFavorite()) {
            favoriteIcon.setImageResource(R.drawable.baseline_favorite_24);
        } else {
            favoriteIcon.setImageResource(R.drawable.fav);
        }

        // Set click listener for favorite icon
        favoriteIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listData.setFavorite(!listData.isFavorite());
                if (listData.isFavorite()) {
                    favoriteIcon.setImageResource(R.drawable.baseline_favorite_24);
                } else {
                    favoriteIcon.setImageResource(R.drawable.fav);
                }
            }
        });

        return view;
    }

}
