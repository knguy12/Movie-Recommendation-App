package com.example.administrator.movieapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button actionButton = findViewById(R.id.actionButton);
        actionButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActionAct();
            }
        });

        Button comedyButton = findViewById(R.id.comedyButton);
        comedyButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openComedyAct();
            }
        });

        Button thrillerButton = findViewById(R.id.thrillerButton);
        thrillerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openThrillerAct();
            }
        });

        Button sciButton = findViewById(R.id.sciButton);
        sciButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openSciAct();
            }
        });

        Button horrorButton  = findViewById(R.id.horrorButton);
        horrorButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openHorrorAct();
            }
        });

        Button dramaButton = findViewById(R.id.dramaButton);
        dramaButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openDramaAct();
            }
        });
    }
    public void openActionAct()
    {
        Intent intent = new Intent(this, ActionActivity.class);
        startActivity(intent);
    }
    public void openThrillerAct()
    {
        Intent intent = new Intent(this, ThrillerActivity.class);
        startActivity(intent);
    }
    public void openComedyAct()
    {
        Intent intent = new Intent(this, ComedyActivity.class);
        startActivity(intent);
    }
    public void openSciAct()
    {
        Intent intent = new Intent(this, SciFiActivity.class);
        startActivity(intent);
    }
    public void openHorrorAct()
    {
        Intent intent = new Intent(this, HorrorActivity.class);
        startActivity(intent);
    }
    public void openDramaAct()
    {
        Intent intent = new Intent(this, DramaActivity.class);
        startActivity(intent);
    }
}
