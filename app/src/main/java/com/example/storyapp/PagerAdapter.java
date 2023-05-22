package com.example.storyapp;

import android.content.Context;
import android.media.Image;
import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Locale;

public class PagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    ListData dataArrayList;
    Context context;
    LayoutInflater layoutInflater;

    TextToSpeech tts;

    boolean isSpeaking = false;

    public PagerAdapter(ListData dataArrayList, Context context) {
        this.dataArrayList = dataArrayList;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        tts = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = tts.setLanguage(Locale.getDefault());
                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    }
                } else {
                    Log.e("TTS", "Initialization failed");
                }
            }
        });
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

        FloatingActionButton tts = view.findViewById(R.id.TTSButton);
        tts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isSpeaking) {
                    isSpeaking = true;
                    speakText(dataArrayList.getStories().get(position).textPage);
                }
                else {stopTTS();
                isSpeaking=false;}
            }
        });

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((View)object);
    }

    private void speakText(String text) {
        if (tts != null) {
            tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
        }
    }

    public void stopTTS() {
        if (tts != null) {
            tts.stop();
        }
    }
}
