package com.blogspot.uzhvij.paginglist.business_logic;

import androidx.annotation.NonNull;
import androidx.paging.PositionalDataSource;
import com.blogspot.uzhvij.paginglist.data.FilmFileStorage;
import java.util.ArrayList;
import java.util.List;

public class FilmPositionalDataSource extends PositionalDataSource {
    private final FilmFileStorage filmFileStorage;

    FilmPositionalDataSource(FilmFileStorage filmFileStorage) {
        this.filmFileStorage = filmFileStorage;
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams params, @NonNull LoadInitialCallback callback) {
        List result = filmFileStorage.getData(params.requestedStartPosition, params.requestedLoadSize);
        callback.onResult(result, 0);
    }

    @Override
    public void loadRange(@NonNull LoadRangeParams params, @NonNull LoadRangeCallback callback) {
        List result;
        try {
            result = filmFileStorage.getData(params.startPosition, params.loadSize);
        } catch (IndexOutOfBoundsException e) {
            result = new ArrayList();
        }
        callback.onResult(result);
    }
}
