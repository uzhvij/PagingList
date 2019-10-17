package com.blogspot.uzhvij.paginglist.DataSource;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

class FilmStorage {
    private List<Film> films = null;
    private String filename = "C:jsonFilms.docx.txt";

    public FilmStorage() {
        Gson gson = new Gson();
        JsonReader reader = null;
        try {
            reader = new JsonReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Film[] data;
        if (reader != null) {
            data = gson.fromJson(reader, Film[].class);
            films = Arrays.asList(data);
        }
    }

    List<Film> getData(){
        return films;
    }
}
