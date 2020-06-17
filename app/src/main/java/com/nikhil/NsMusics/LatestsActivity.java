package com.nikhil.NsMusics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LatestsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<SongsDetails> songsList = new ArrayList<>();

        songsList.add(new SongsDetails("Diljit Dosanjh", "High End", R.drawable.three));
        songsList.add(new SongsDetails("Diljit Dosanjh", "Lamborghini", R.drawable.three));
        songsList.add(new SongsDetails("Artist1", "Music 1", R.drawable.three));
        songsList.add(new SongsDetails("Artist2", "Music 2", R.drawable.three));
        songsList.add(new SongsDetails("Artist3", "Music 3", R.drawable.three));
        songsList.add(new SongsDetails("Artist4", "Music 4", R.drawable.three));
        songsList.add(new SongsDetails("Artist5", "Music 5", R.drawable.three));
        songsList.add(new SongsDetails("Artist6", "Music 6", R.drawable.three));
        songsList.add(new SongsDetails("Artist7", "Music 7", R.drawable.three));
        songsList.add(new SongsDetails("Artist8", "Music 8", R.drawable.three));
        songsList.add(new SongsDetails("Artist9", "Music 9", R.drawable.three));
        songsList.add(new SongsDetails("Artist10", "Music 10", R.drawable.three));
        songsList.add(new SongsDetails("Artist11", "Music 11", R.drawable.three));
        songsList.add(new SongsDetails("Artist12", "Music 12", R.drawable.three));

        SongsAdapter songsAdapter = new SongsAdapter(this, songsList);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(songsAdapter);

    }
}