package com.blogspot.uzhvij.paginglist.business_logic;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.blogspot.uzhvij.paginglist.R;
import com.blogspot.uzhvij.paginglist.data.NamesFieldsList;
import com.blogspot.uzhvij.paginglist.model.Film;

import java.util.List;

class FilmViewHolder extends RecyclerView.ViewHolder {
    private final TextView name;

    FilmViewHolder(View view) {
        super(view);
        name = view.findViewById(R.id.film_name);
    }

    void bind(Film film) {
        name.setText(createTextData(film));
    }

    private String createTextData(Film film){
        List list = NamesFieldsList.getData();
        StringBuilder builder = new StringBuilder();
        builder.append(list.get(0)).append(film.getName()).append(System.getProperty("line.separator")).
                append(list.get(1)).append(film.getYear()).append(System.getProperty("line.separator")).
                append(list.get(3)).append(film.getCountries()).append(System.getProperty("line.separator")).
                append(list.get(4)).append(film.getDescription());
        return builder.toString();
    }
}
