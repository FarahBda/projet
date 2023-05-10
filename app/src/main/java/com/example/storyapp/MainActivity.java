package com.example.storyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.storyapp.databinding.ActivityMainBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ListAdapter listAdapter;
    ArrayList<ListData> dataArrayList = new ArrayList<>();
    ListData listData;
    boolean[] favorites;

    ImageButton imageButton;

    FloatingActionButton floating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageList = {R.drawable.alice,R.drawable.cendrillon, R.drawable.hanselgretel, R.drawable.lespetitscochons, R.drawable.peterpan, R.drawable.petitpoucet, R.drawable.pinocchio};
        String[] titleList = {"Alice", "Cendrillon", "Hansel et Gretel", "Les trois petits cochons", "Peter Pan","Petit poucet","Pinocchio"};
        String[] pageList = {"3 pages", "2 pages", "4 pages","3 pages", "5 pages", "4 pages", "2 pages"};

        favorites = new boolean[imageList.length];

        for (int i = 0; i < imageList.length; i++){
            listData = new ListData(titleList[i], pageList[i], imageList[i]);
            dataArrayList.add(listData);
        }


        listAdapter = new ListAdapter(MainActivity.this, dataArrayList);
        binding.listview.setAdapter(listAdapter);

//        binding.listview
//                .setClickable(true);
//
//
//        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, DetailedActivity.class);
//                intent.putExtra("name", titleList[i]);
//                intent.putExtra("time", pageList[i]);
//                intent.putExtra("image", imageList[i]);
//                startActivity(intent);
//            }
//        });
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