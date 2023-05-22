package com.example.storyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_fav:
                Intent intent = new Intent(MainActivity.this,FavActivity.class);
                startActivity(intent);
                return true;
            case R.id.menu_about:
                Intent intent2 = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent2);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity(); // exit the app completely
    }
}