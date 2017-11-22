package com.example.vr.Cinemacity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vr.Cinemacity.R;
import com.example.vr.Cinemacity.models.Films;

/**
 * Created by vr on 2017-06-05.
 */

public class FilmsListAdapter extends ArrayAdapter<Films> {

    private Films[] films;

    public FilmsListAdapter(@NonNull Context context, Films[] films) {
        super(context, R.layout.films_row, films);
        this.films = films;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater buckyInflater = LayoutInflater.from(getContext());
        View customView = buckyInflater.inflate(R.layout.films_row,parent,false);

        String SingleTitleItem = getItem(position).getTitle();
        String SingleDateItem  = getItem(position).getDate_show();
        String SingleProductionItem = getItem(position).getProduction();
        String SingleYearItem = getItem(position).getYear();
        String SingleTimeItem = getItem(position).getTime();
        String obrazek = getItem(position).getImg();
        String asdf = getItem(position).getDesc();

        ImageView imageView = ((ImageView)customView.findViewById(R.id.imageViewFilm));
        TextView title = ((TextView)customView.findViewById(R.id.textViewFilmTitle));
        TextView op_kr = ((TextView)customView.findViewById(R.id.opis_krotki));
        TextView date = ((TextView)customView.findViewById(R.id.textViewFilmDate));
        TextView production= ((TextView)customView.findViewById(R.id.textViewFilmProduction));

        title.setText(SingleTitleItem);
        op_kr.setText(asdf.substring(0,250)+"...");
        date.setText("Czas trwania: "+SingleTimeItem+"\n"+"Data premiery:"+SingleDateItem);
        production.setText("Produkcja: "+SingleProductionItem);


        Context context = imageView.getContext();


        int id = context.getResources().getIdentifier(obrazek, "drawable", context.getPackageName());
        Drawable xdx = ContextCompat.getDrawable(context, id);
        Bitmap bsd = ((BitmapDrawable)xdx).getBitmap();
        Bitmap bMapScaled = Bitmap.createScaledBitmap(bsd, 90, 120, true);
        imageView.setImageBitmap(bMapScaled);



        return customView;

    }

}
