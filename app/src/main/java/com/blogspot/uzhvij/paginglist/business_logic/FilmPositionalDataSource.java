package com.blogspot.uzhvij.paginglist.business_logic;

import androidx.annotation.NonNull;
import androidx.paging.PositionalDataSource;
import com.blogspot.uzhvij.paginglist.data.FilmFileStorage;
import com.blogspot.uzhvij.paginglist.model.Film;
import java.util.ArrayList;
import java.util.List;

public class FilmPositionalDataSource extends PositionalDataSource<Film> {
    private final FilmFileStorage filmFileStorage;

    FilmPositionalDataSource(FilmFileStorage filmFileStorage) {
        this.filmFileStorage = filmFileStorage;
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams params, @NonNull LoadInitialCallback<Film> callback) {
        List<Film> result = filmFileStorage.getData(params.requestedStartPosition, params.requestedLoadSize);
        callback.onResult(result, 0);
    }

    @Override
    public void loadRange(@NonNull LoadRangeParams params, @NonNull LoadRangeCallback<Film> callback) {
        List<Film> result;
        try {
            result = filmFileStorage.getData(params.startPosition, params.loadSize);
        } catch (IndexOutOfBoundsException e) {
            result = new ArrayList();
        }
        callback.onResult(result);
    }
}
