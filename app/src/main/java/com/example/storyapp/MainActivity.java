package com.example.storyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.storyapp.databinding.ActivityMainBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ListAdapter listAdapter;
    static ArrayList<ListData> dataArrayList = new ArrayList<>();
    ListData listData;

    public static ArrayList<ListData> getDataArrayList() {
        return dataArrayList;
    }

    boolean[] favorites;
    FloatingActionButton floating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


//        int[] imageList = {R.drawable.cendrillon, R.drawable.hanselgretel, R.drawable.lespetitscochons, R.drawable.peterpan, R.drawable.petitpoucet, R.drawable.pinocchio};
//        String[] titleList = {"Cendrillon", "Hansel et Gretel", "Les trois petits cochons", "Peter Pan","Petit poucet","Pinocchio"};
//        String[] pageList = { "2 pages", "4 pages","3 pages", "5 pages", "4 pages", "2 pages"};
//
//        favorites = new boolean[imageList.length];

//        for (int i = 0; i < imageList.length; i++){
//            listData = new ListData(titleList[i], pageList[i], imageList[i]);
//            dataArrayList.add(listData);
//        }

        dataArrayList=DataFill.fillData();
        listAdapter = new ListAdapter(MainActivity.this, dataArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                favorites[i] = !favorites[i];
                listAdapter.notifyDataSetChanged();
                return true;
            }
        });

        floating= (FloatingActionButton) findViewById(R.id.floating);
        floating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FavActivity.class);
                startActivity(intent);
            }
        });
    }

}