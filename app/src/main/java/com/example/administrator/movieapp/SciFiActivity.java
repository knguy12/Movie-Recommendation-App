package com.example.administrator.movieapp;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class SciFiActivity extends AppCompatActivity
{
    private int images[] = {R.drawable.thing, R.drawable.strangerthings, R.drawable.sourcecode, R.drawable.snowpiercer, R.drawable.serenity, R.drawable.donniedarko, R.drawable.edgeoftommorow, R.drawable.ex_machina, R.drawable.paprika, R.drawable.predestinatio, R.drawable.coherence, R.drawable.chronicle, R.drawable.childernofmen, R.drawable.moon, R.drawable.equilibrium, R.drawable.dredd, R.drawable.thelobster, R.drawable.mrnobody, R.drawable.sunshine, R.drawable.thefountain};
    private String movieTitle[] = {"The Thing", "Super 8", "Source Code", "Snowpiercer", "Serenity", "Donnie Darko", "Edge Of Tommorow","Ex Machina","Paprika","Predestination", "Coherence", "Chronicle", "Children Of Men", "Moon", "Equilibrium", "Dredd", "The Lobster", "Mr.Nobody", "Sunshine", "The Fountain"};
    private ImageView poster;
    private TextView movieText;
    private String title;
    private int selectedMovie;
    private int differentMovie;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        Random in = new Random();
        selectedMovie = in.nextInt(20);

        poster = findViewById(R.id.moviePoster);
        poster.setImageResource(images[selectedMovie]);

        movieText = findViewById(R.id.movieText);
        title = movieTitle[selectedMovie];
        movieText.setText(title);

        Button anotherMovie = findViewById(R.id.notMything);
        anotherMovie.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                counter++;
                Random next = new Random();
                differentMovie = next.nextInt(20);
                poster.setImageResource(images[differentMovie]);
                title = movieTitle[differentMovie];
                movieText.setText(title);
                movieText.setPaintFlags(movieText.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
            }
        });
        Button description = findViewById(R.id.tellMeMore);
        description.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openDesc();
            }
        });
    }
    public void openDesc()
    {
        Intent intent = new Intent(this, SciFiDescription.class);
        intent.putExtra("chosenMovie", selectedMovie);
        intent.putExtra("differentMovie", differentMovie);
        intent.putExtra("movieImage", images);
        intent.putExtra("counter", counter);
        startActivity(intent);
    }
}

