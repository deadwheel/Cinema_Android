package com.example.vr.Cinemacity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;


public class RezerwacjaFragment extends Fragment {

    String kino_w;
    String film_w;
    String data_w;
    String godz_w;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rezerwacja, container, false);
        final Spinner kino = (Spinner)view.findViewById(R.id.spinner);
        final Spinner film = (Spinner)view.findViewById(R.id.spinner2);
        final Spinner data_f = (Spinner)view.findViewById(R.id.spinner3);
        final Spinner godz_f = (Spinner)view.findViewById(R.id.spinner4);
        film.setPrompt("Jakis film");


        kino.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                kino_w = parent.getItemAtPosition(position).toString();
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        film.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                film_w = parent.getItemAtPosition(position).toString();
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        data_f.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                data_w = parent.getItemAtPosition(position).toString();
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        godz_f.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                godz_w = parent.getItemAtPosition(position).toString();
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        Button asdf = (Button)view.findViewById(R.id.button2);

        asdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!"Wybierz kino".equals(kino_w) && !"Wybierz film".equals(film_w) && !"Wybierz date".equals(data_w) && !"Wybierz godzine".equals(godz_w)) {
                    Intent df = new Intent(getActivity().getApplicationContext(), DisplayRezerwacjaNext.class);
                    df.putExtra("kino", kino_w);
                    df.putExtra("tytul", film_w);
                    df.putExtra("data", data_w);
                    df.putExtra("godz", godz_w);
                    startActivity(df);
                }
            }
        });

        return view;
    }
}
