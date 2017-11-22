package com.example.vr.Cinemacity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayFilmsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_films);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String desc = intent.getStringExtra("desc");
        String date_show = intent.getStringExtra("date_show");
        String year = intent.getStringExtra("year");
        String time = intent.getStringExtra("time");
        String production = intent.getStringExtra("production");
        String director = intent.getStringExtra("director");
        String obrazek = intent.getStringExtra("img");


        ImageView imageView = ((ImageView)findViewById(R.id.imageViewDisplayImg));
        TextView titleText = ((TextView)findViewById(R.id.textViewDisplayFilmTitle));
        TextView descText = ((TextView)findViewById(R.id.textViewDisplayFilmSubDesc));
        TextView premiera = ((TextView)findViewById(R.id.premiera));
        TextView czas_trwania = ((TextView)findViewById(R.id.czas_trwania));
        TextView produkcja = ((TextView)findViewById(R.id.produkcja));



        titleText.setText(title);
        descText.setText(desc);
        premiera.setText(date_show);
        czas_trwania.setText(time);
        produkcja.setText(production);
        Context context = imageView.getContext();
        int id = context.getResources().getIdentifier(obrazek, "drawable", context.getPackageName());
        imageView.setImageResource(id);



    }




    }
