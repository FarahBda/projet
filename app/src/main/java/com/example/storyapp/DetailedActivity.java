package com.example.storyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.storyapp.databinding.ActivityDetailedBinding;

import java.util.ArrayList;
import java.util.List;

public class DetailedActivity extends AppCompatActivity {
    ActivityDetailedBinding binding;
    ViewPager viewPager;
    ArrayList<ListData> dataArrayList = new ArrayList<>();

    ListData data;

    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        dataArrayList = MainActivity.getDataArrayList();

        for (int i = 0; i < dataArrayList.size(); i++) {
            if (dataArrayList.get(i).getTitle().equals(binding.detailName))
            {

            }
        }

        viewPager = (ViewPager) findViewById(R.id.pager);

        PagerAdapter adapter = new PagerAdapter(dataArrayList, DetailedActivity.this);
        viewPager.setAdapter(adapter);

        Intent intent = this.getIntent();
        if (intent != null){
            String name = intent.getStringExtra("name");
            binding.detailName.setText(name);
        }
    }
}