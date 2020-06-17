package com.nikhil.NsMusics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout foreverId1, trendingId1, latestId1, playlistId1, foreverId2, trendingId2, latestId2, playlistId2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foreverId1 = findViewById(R.id.forever_id);
        trendingId1 = findViewById(R.id.trendings_id);
        latestId1 = findViewById(R.id.latests_id);
        playlistId1 = findViewById(R.id.playlists_id);

        foreverId2 = findViewById(R.id.forever_id2);
        trendingId2 = findViewById(R.id.trendings_id2);
        latestId2 = findViewById(R.id.latests_id2);
        playlistId2 = findViewById(R.id.playlists_id2);


        foreverId1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForeverActivity.class);
                startActivity(intent);
            }
        });

        trendingId1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TrendingsActivity.class);
                startActivity(intent);
            }
        });

        latestId1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LatestsActivity.class);
                startActivity(intent);
            }
        });

        playlistId1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(intent);
            }
        });


        foreverId2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForeverActivity.class);
                startActivity(intent);
            }
        });

        trendingId2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TrendingsActivity.class);
                startActivity(intent);
            }
        });


        latestId2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LatestsActivity.class);
                startActivity(intent);
            }
        });

        playlistId2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(intent);
            }
        });

    }
}