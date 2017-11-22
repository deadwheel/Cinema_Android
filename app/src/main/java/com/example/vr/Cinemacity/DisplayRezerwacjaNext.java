package com.example.vr.Cinemacity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayRezerwacjaNext extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezerwacja);

        Intent intent = getIntent();
        String kino = intent.getStringExtra("kino");
        String film = intent.getStringExtra("tytul");
        String data_f = intent.getStringExtra("data");
        String godz = intent.getStringExtra("godz");



        TextView titleText = ((TextView)findViewById(R.id.textViewDisplayFilmTitle));
        TextView premiera = ((TextView)findViewById(R.id.premiera));
        TextView czas_trwania = ((TextView)findViewById(R.id.czas_trwania));
        TextView produkcja = ((TextView)findViewById(R.id.produkcja));



        titleText.setText(kino);
        premiera.setText(film);
        czas_trwania.setText(data_f);
        produkcja.setText(godz);



    }




    }
