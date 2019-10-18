package com.blogspot.uzhvij.paginglist.business_logic;

import androidx.paging.DataSource;

import com.blogspot.uzhvij.paginglist.data.FilmStorage;
import com.blogspot.uzhvij.paginglist.model.Film;

public class FilmDataFactory extends DataSource.Factory<Integer, Film> {
    private final FilmStorage filmStorage;
    private FilmPositionalDataSource dataSource;

    public FilmDataFactory(FilmStorage filmStorage) {
        this.filmStorage = filmStorage;
    }

    @Override
    public DataSource create() {
        dataSource = new FilmPositionalDataSource(filmStorage);
        return dataSource;
    }
}

