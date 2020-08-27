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

public class HorrorActivity extends AppCompatActivity
{
    private int images[] = {R.drawable.babadook, R.drawable.cabin, R.drawable.chaser, R.drawable.cloverfield, R.drawable.devil, R.drawable.dontbreath, R.drawable.greenroom, R.drawable.hereditary, R.drawable.thing, R.drawable.wailing, R.drawable.dayslater, R.drawable.trickrtreat, R.drawable.identity, R.drawable.theorphanage, R.drawable.eventhorizon, R.drawable.skinilive, R.drawable.secretofmarrowbone, R.drawable.lettherightonein, R.drawable.traintobusan, R.drawable.thewitch};
    private String movieTitle[] = {"The Babadook", "The Cabin in the Woods", "The Chaser", "10 Cloverfield Lane", "I Saw The Devil", "Don't Breath", "Green Room","Hereditary","The Thing","The Wailing", "28 Days Later", "Trick 'r Treat", "Identity", "The Orphanage", "Event Horizon", "The Skin I Live", "The Secret of Marrowbone", "Let the Right One In", "Train to Busan", "The Witch"};
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
        Intent intent = new Intent(this, HorrorDescriptionActivity.class);
        intent.putExtra("chosenMovie", selectedMovie);
        intent.putExtra("differentMovie", differentMovie);
        intent.putExtra("movieImage", images);
        intent.putExtra("counter", counter);
        startActivity(intent);
    }
}

