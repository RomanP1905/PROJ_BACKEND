package com.example.roman.project4musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Geef alle buttons een variabel

        Button artistbutton = (Button) findViewById(R.id.button_artist);
        Button albumbutton = (Button) findViewById(R.id.button_album);
        Button genrebutton = (Button) findViewById(R.id.button_genre);
        Button playlistbutton = (Button) findViewById(R.id.button_playlist);

        //Voeg een onclicklistener toe zodat er code loopt wanneer er op de knoppen wordt geklikt
        artistbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Assign een intent aan een variabel
                Intent Album = new Intent(view.getContext(), ArtistActivity.class);
                //Voer de variabel in een startActivity methode, dit opent de intent opgeslagen in de variabel
                startActivity(Album);
            }
        });

        albumbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Artist = new Intent(view.getContext(), AlbumActivity.class);
                startActivity(Artist);
            }
        });

        genrebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Genre = new Intent(view.getContext(), GenreActivity.class);
                startActivity(Genre);
            }
        });

        playlistbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Playlist = new Intent(view.getContext(), PlaylistActivity.class);
                startActivity(Playlist);
            }
        });
    }
}
