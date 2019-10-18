package com.blogspot.uzhvij.paginglist.data;

import android.content.Context;
import android.content.res.AssetManager;
import com.blogspot.uzhvij.paginglist.model.Film;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class FilmStorage {
    private List<Film> films = null;

    public FilmStorage(Context context) {
        Gson gson = new Gson();
        String stringFromJson = null;
        String filename = "jsonFilms.txt";

        try {
            AssetManager assetManager = context.getAssets();
            InputStream inputStream = assetManager.open(filename);
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            stringFromJson = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Film[] data;
        if (stringFromJson != null) {
            data = gson.fromJson(stringFromJson, Film[].class);
            films = Arrays.asList(data);
        }
    }

    public List<Film> getData(int startPosition, int loadSize) {
        return films.subList(startPosition, startPosition + loadSize);
    }
}
