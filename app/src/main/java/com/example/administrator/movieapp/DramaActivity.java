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

public class DramaActivity extends AppCompatActivity
{
    private int images[] = {R.drawable.angrymen, R.drawable.arrival, R.drawable.callme, R.drawable.fifty, R.drawable.immitationgame, R.drawable.moonlight, R.drawable.prestige, R.drawable.silverlining, R.drawable.theoryofeverything, R.drawable.whiplash, R.drawable.snowden, R.drawable.catchme, R.drawable.boyhood, R.drawable.taxidriver, R.drawable.miracleincell, R.drawable.hope, R.drawable.silenced, R.drawable.bewithyou, R.drawable.eightgrader, R.drawable.daysofsummer, R.drawable.napoleondynamite};
    private String movieTitle[] = {"12 Angry Men", "Arrival", "Call Me By Your Name", "50/50", "The Imitation Game", "Moonlight", "The Prestige","Silver Linging Playbook","Theory Of Everything","Whiplash","Snowden", "Catch Me If You Can", "Boyhood", "A Taxi Driver", "Miracle in Cell No.7", "Hope", "Silenced", "Be With You", "Eighth Grader", "500 Days Of Summer", "Napoleon Dynamite"};
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
        selectedMovie = in.nextInt(21);

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
                differentMovie = next.nextInt(21);
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
        Intent intent = new Intent(this, DramaDescription.class);
        intent.putExtra("chosenMovie", selectedMovie);
        intent.putExtra("differentMovie", differentMovie);
        intent.putExtra("movieImage", images);
        intent.putExtra("counter", counter);
        startActivity(intent);
    }
}

