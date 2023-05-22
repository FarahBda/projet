package com.example.storyapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.storyapp.databinding.AboutLayoutBinding;

public class AboutActivity extends AppCompatActivity {

    AboutLayoutBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = AboutLayoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.githubBtn.setOnClickListener(v -> openGithub());
        
        binding.firstCard.setOnClickListener(v -> sendMail(binding.firstCard.getId()));
        binding.secondCard.setOnClickListener(v -> sendMail(binding.secondCard.getId()));
    }

    private void sendMail(int item) {
        switch (item)
        {
            case R.id.firstCard:
                String mail = "moucimohamedrachid@gmail.com";
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"+mail));
                startActivity(intent);
                break;
            case R.id.secondCard:
                String mail2 = "farahboudoua@gmail.com";
                Intent intent2 = new Intent(Intent.ACTION_SENDTO);
                intent2.setData(Uri.parse("mailto:"+mail2));
                startActivity(intent2);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + item);
        }
    }

    private void openGithub() {
        String url = "https://github.com/FarahBda/projet";

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            startActivity(Intent.createChooser(intent, "Open with"));
        }
    }
}
