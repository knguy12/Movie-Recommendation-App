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

public class ThrillerActivity extends AppCompatActivity
{
    private int images[] = {R.drawable.departed, R.drawable.blackswan, R.drawable.memento, R.drawable.nightcrawler, R.drawable.oldboy, R.drawable.prisoners, R.drawable.seven, R.drawable.shutterisland, R.drawable.vendetta, R.drawable.zodiac, R.drawable.usualsuspects, R.drawable.drive, R.drawable.gangsofnewyork, R.drawable.americanpsycho, R.drawable.reservoirdogs, R.drawable.coldeyes, R.drawable.lookout, R.drawable.blooddiamond, R.drawable.gonebabygone, R.drawable.primalfear};
    private String movieTitle[] = {"The Departed", "Black Swan", "Memento", "Nightcrawler", "OldBoy", "Prisoners", "Se7en","Shutter Island","V for Vendetta","Zodiac","The Usual Suspect", "Drive", "Gangs Of New York", "American Psycho", "Reservoir Dogs", "Cold Eyes", "The Lookout", "Blood Diamond", "Gone Baby Gone", "Primal Fear"};
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
        Intent intent = new Intent(this, DescriptionThriller.class);
        intent.putExtra("chosenMovie", selectedMovie);
        intent.putExtra("movieImage", images);
        intent.putExtra("differentMovie", differentMovie);
        intent.putExtra("counter", counter);
        startActivity(intent);
    }
}
