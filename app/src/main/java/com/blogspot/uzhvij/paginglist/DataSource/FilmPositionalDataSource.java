package com.blogspot.uzhvij.paginglist.DataSource;
import androidx.annotation.NonNull;
import androidx.paging.PositionalDataSource;

import java.util.List;

public class FilmPositionalDataSource extends PositionalDataSource<Film> {
    private final FilmStorage filmStorage;

    public FilmPositionalDataSource(FilmStorage filmStorage) {
        this.filmStorage = filmStorage;
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams params, @NonNull LoadInitialCallback<Film> callback) {
        List<Film> result = filmStorage.getData();
        callback.onResult(result,0);
    }

    @Override
    public void loadRange(@NonNull LoadRangeParams params, @NonNull LoadRangeCallback<Film> callback) {
        List<Film> result = filmStorage.getData();
        callback.onResult(result);
    }
}
