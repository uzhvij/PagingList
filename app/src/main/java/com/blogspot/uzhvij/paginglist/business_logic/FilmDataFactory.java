package com.blogspot.uzhvij.paginglist.business_logic;

import androidx.paging.DataSource;

import com.blogspot.uzhvij.paginglist.data.FilmFileStorage;
import com.blogspot.uzhvij.paginglist.model.Film;

public class FilmDataFactory extends DataSource.Factory<Integer, Film> {
    private final FilmFileStorage filmFileStorage;

    public FilmDataFactory(FilmFileStorage filmFileStorage) {
        this.filmFileStorage = filmFileStorage;
    }

    @Override
    public DataSource create() {
        return new FilmPositionalDataSource(filmFileStorage);
    }
}

