package com.blogspot.uzhvij.paginglist.data;

import androidx.annotation.NonNull;
import androidx.paging.PositionalDataSource;
import com.blogspot.uzhvij.paginglist.model.Film;
import java.util.ArrayList;
import java.util.List;

public class FilmPositionalDataSource extends PositionalDataSource<Film> {
    private final FilmStorage filmStorage;

    public FilmPositionalDataSource(FilmStorage filmStorage) {
        this.filmStorage = filmStorage;
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams params, @NonNull LoadInitialCallback<Film> callback) {
        List<Film> result = filmStorage.getData(params.requestedStartPosition, params.requestedLoadSize);
        callback.onResult(result, 0);
    }

    @Override
    public void loadRange(@NonNull LoadRangeParams params, @NonNull LoadRangeCallback<Film> callback) {
        List<Film> result;
        try {
            result = filmStorage.getData(params.startPosition, params.loadSize);
        } catch (IndexOutOfBoundsException e) {
            result = new ArrayList();
        }
        callback.onResult(result);
    }
}
