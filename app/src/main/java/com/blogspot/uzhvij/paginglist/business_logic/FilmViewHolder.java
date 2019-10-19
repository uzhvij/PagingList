package com.blogspot.uzhvij.paginglist.business_logic;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.blogspot.uzhvij.paginglist.R;
import com.blogspot.uzhvij.paginglist.data.NamesFieldsList;
import com.blogspot.uzhvij.paginglist.model.Film;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import java.util.List;

class FilmViewHolder extends RecyclerView.ViewHolder {
    private final TextView name;
    private final ImageView imageView;

    FilmViewHolder(View view) {
        super(view);
        name = view.findViewById(R.id.film_name);
        imageView = view.findViewById(R.id.imageView);
    }

    void bind(Film film) {
        name.setText(createTextData(film));
        Picasso.get().
                load(createImageUri(film)).
                resize(300, 450).
                onlyScaleDown().
                memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).
                placeholder(R.drawable.ic_menu_gallery).
                error(R.drawable.ic_menu_help).
                into(imageView);
    }

    private String createTextData(Film film) {
        List list = NamesFieldsList.getData();
        return list.get(0) + film.getName() + System.getProperty("line.separator") +
                list.get(1) + film.getYear() + System.getProperty("line.separator") +
                list.get(3) + film.getCountries() + System.getProperty("line.separator") +
                list.get(4) + film.getDescription();
    }

    private String createImageUri(Film film) {
        String uri = film.getImage();
        int variant = 0;
        int index;

        if (uri.indexOf("epgservice") > 0 | uri.indexOf("start") > 0) {
            variant = 1;
        } else if (uri.indexOf("tvzavr") > 0) {
            variant = 2;
        }

        switch (variant) {
            case 1:
                index = uri.indexOf("http", 10);
                uri = uri.substring(index);
                break;
            case 2:
                index = uri.indexOf("http", 10);
                uri = uri.substring(index);
                index = uri.indexOf("&");
                uri = uri.substring(0, index);
                break;
        }
        return uri;
    }
}
