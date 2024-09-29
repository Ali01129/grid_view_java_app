package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    String[] gridViewStrings = {"Camera", "Camera Roll", "Featured", "My Videos", "Likes", "Watch Later", "Stats", "Subscriptions", "Help"};

    int[] gridViewImages = {
            R.drawable.camera_pic, R.drawable.camera_roll_pic, R.drawable.featured,
            R.drawable.my_videos, R.drawable.likes, R.drawable.clock_pic    ,
            R.drawable.stats_pic, R.drawable.subscribe, R.drawable.question
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_view);

        CustomAdapter adapt = new CustomAdapter(MainActivity.this, gridViewStrings, gridViewImages);
        gridView.setAdapter(adapt);

    }
}