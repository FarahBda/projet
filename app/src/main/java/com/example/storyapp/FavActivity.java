package com.example.storyapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.storyapp.databinding.FavBinding;

public class FavActivity extends AppCompatActivity {
    FavBinding binding;

    ListAdapter listAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FavBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        listAdapter = new ListAdapter(FavActivity.this,ListAdapter.getFavorites());
        binding.favList.setAdapter(listAdapter);


    }
}
