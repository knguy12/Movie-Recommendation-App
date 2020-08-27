package com.example.administrator.movieapp;

import android.content.Intent;
import android.drm.DrmStore;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class ActionActivity extends AppCompatActivity
{
    private int images[] = {R.drawable.john_wick, R.drawable.kisskiss, R.drawable.manfromnowhere, R.drawable.manfromuncle, R.drawable.battleroyale, R.drawable.nice_guys, R.drawable.sicario, R.drawable.looper, R.drawable.collateral, R.drawable.hellorhighwater, R.drawable.pointbreak, R.drawable.veteran, R.drawable.theaccountant, R.drawable.threedays, R.drawable.assassins, R.drawable.intothefire, R.drawable.thegrey, R.drawable.policestory, R.drawable.jackreacher, R.drawable.nonstop};
    private String movieTitle[] = {"John Wick", "Kiss Kiss Bang Bang", "The Man From Nowhere", "The Man From U.N.C.L.E", "Battle Royale", "Nice Guys", "Sicario","Looper","Collateral","Hell Or High Water","Point Break", "Veteran", "The Accountant", "The Next Three Days", "13 Assassins", "71:Into the FIre", "The Grey", "Police Story", "Jack Reacher", "Non-Stop"};
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
        Intent intent = new Intent(this, Description.class);
        intent.putExtra("chosenMovie", selectedMovie);
        intent.putExtra("differentMovie", differentMovie);
        intent.putExtra("movieImage", images);
        intent.putExtra("counter", counter);
        startActivity(intent);
    }
}
