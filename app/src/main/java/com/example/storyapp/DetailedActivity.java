package com.example.storyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;

import com.example.storyapp.databinding.ActivityDetailedBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class DetailedActivity extends AppCompatActivity {
    ActivityDetailedBinding binding;
    ViewPager viewPager;
    ArrayList<ListData> dataArrayList = new ArrayList<>();

    ListData data;

    MediaPlayer mediaPlayer;

    TextView title;

    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        mediaPlayer=MediaPlayer.create(this,R.raw.sound1);
        playSound();
        Intent intent = this.getIntent();
        if (intent != null){
            String name = intent.getStringExtra("name");
            binding.detailName.setText(name);
        }
        dataArrayList = MainActivity.getDataArrayList();

        for (int i = 0; i < dataArrayList.size(); i++) {
            if (dataArrayList.get(i).getTitle().equals(intent.getStringExtra("name"))) {
                data = dataArrayList.get(i);
                break;
            }
        }

        viewPager = (ViewPager) findViewById(R.id.pager);

        PagerAdapter adapter = new PagerAdapter(data, DetailedActivity.this);
        viewPager.setAdapter(adapter);



    }
    private void playSound() {
        if (mediaPlayer != null) {
            mediaPlayer.start(); // Start playing the sound
        }
    }

    // Method to stop the sound
    private void stopSound() {
        if (mediaPlayer != null) {
            mediaPlayer.stop(); // Stop playing the sound
            mediaPlayer.release(); // Release resources
            mediaPlayer = null; // Set to null to avoid further usage
        }
    }
    public void onBackPressed() {
        super.onBackPressed();
        stopTTS();
    }

    protected void onDestroy() {
        super.onDestroy();
        stopTTS();
    }

    private void stopTTS() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        if (viewPager != null && viewPager.getAdapter() instanceof PagerAdapter) {
            PagerAdapter pagerAdapter = (PagerAdapter) viewPager.getAdapter();
            pagerAdapter.stopTTS();
        }
    }
}
