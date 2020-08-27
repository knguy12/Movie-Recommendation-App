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

public class ComedyActivity extends AppCompatActivity
{
    private int images[] = {R.drawable.forrestgump, R.drawable.grandbudapest, R.drawable.hotfuzz, R.drawable.johnnyenglish, R.drawable.keanu, R.drawable.kingsman, R.drawable.midnightrunners, R.drawable.montypyton, R.drawable.spy, R.drawable.worldsend, R.drawable.swissarmymen, R.drawable.irongiant, R.drawable.shaunofthedead, R.drawable.airplane, R.drawable.scottpilgrim, R.drawable.kickass, R.drawable.theinterview, R.drawable.pineappleexpress, R.drawable.superbad, R.drawable.dointheshadows };
    private String movieTitle[] = {"Forrest Gump", "The Grand Budapest Hotel", "Hot Fuzz", "Johnny English Reborn", "Keanu", "Kingsman: The Secret Service", "Midnight Runners","Monty Pyton and the Holy Grail","Spy","The Worlds End", "Swiss Army Men", "The Iron Giant", "Shaun of the Dead", "Airplane", "Scott Pilgrim Vs. The Worlds", "Kick-Ass", "The Interview", "Pineapple Express", "SuperBad", "What We Do In The Shadows"};
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
        Intent intent = new Intent(this, ComedyDescription.class);
        intent.putExtra("chosenMovie", selectedMovie);
        intent.putExtra("differentMovie", differentMovie);
        intent.putExtra("movieImage", images);
        intent.putExtra("counter", counter);
        startActivity(intent);
    }
}
