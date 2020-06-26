package com.example.huaweivideodemo;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author hanfeng
 * Guide the user to select the interested resource module. And save the selected button
 * name in SharedPreferences.
 *
 * since 2020.6.26
 */
public class UserGuideActivity extends AppCompatActivity {

    @Override
    @SuppressLint("CommitPrefEdits")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button short_video = findViewById(R.id.short_video);
        short_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("short_video", true);
            }
        });

        final Button serial_tv = findViewById(R.id.serial_tv);
        serial_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("serial_tv", true);
            }
        });

        final Button video = findViewById(R.id.video);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("video", true);
            }
        });

        final Button variety_show = findViewById(R.id.variety_show);
        variety_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("variety_show", true);
            }
        });

        final Button children = findViewById(R.id.children);
        children.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("children", true);
            }
        });

        final Button anime = findViewById(R.id.anime);
        anime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("anime", true);
            }
        });

        final Button mangguo_TV = findViewById(R.id.mangguo_TV);
        mangguo_TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("mangguo_TV", true);
            }
        });

        final Button youku = findViewById(R.id.youku);
        youku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("youku", true);
            }
        });

        final Button tencentTV = findViewById(R.id.tencentTV);
        tencentTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("youku", true);
            }
        });

        final Button online_class = findViewById(R.id.online_class);
        online_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("online_class", true);
            }
        });

        final Button documentary = findViewById(R.id.documentary);
        documentary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("documentary", true);
            }
        });

        final Button game = findViewById(R.id.game);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("game", true);
            }
        });

        final Button funny = findViewById(R.id.funny);
        funny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("funny", true);
            }
        });

        final Button food = findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("food", true);
            }
        });

        final Button news = findViewById(R.id.news);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("news", true);
            }
        });

        final Button military = findViewById(R.id.military);
        military.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("military", true);
            }
        });

        final Button cars = findViewById(R.id.cars);
        cars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("cars", true);
            }
        });

        final Button mother_baby = findViewById(R.id.mother_baby);
        mother_baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("mother_baby", true);
            }
        });

        final Button life = findViewById(R.id.life);
        life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("life", true);
            }
        });

        final Button physical_education = findViewById(R.id.physical_education);
        physical_education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("physical_education", true);
            }
        });

        final Button new_video = findViewById(R.id.new_video);
        new_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("new_video", true);
            }
        });

        final Button honor_guest = findViewById(R.id.honor_guest);
        honor_guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("honor_guest", true);
            }
        });

        final Button AI_guest = findViewById(R.id.AI_guest);
        AI_guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("AI_guest", true);
            }
        });

        final Button welfare_society = findViewById(R.id.welfare_society);
        welfare_society.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("Resource_customization_data", MODE_PRIVATE).edit();
                editor.putBoolean("welfare_society", true);
            }
        });
    }
}