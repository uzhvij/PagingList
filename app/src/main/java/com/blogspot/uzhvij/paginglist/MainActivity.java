package com.blogspot.uzhvij.paginglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.blogspot.uzhvij.paginglist.data.NamesFieldsList;
import com.blogspot.uzhvij.paginglist.model.Film;
import com.blogspot.uzhvij.paginglist.data.FilmFileStorage;
import com.blogspot.uzhvij.paginglist.business_logic.FilmDataFactory;
import com.blogspot.uzhvij.paginglist.business_logic.FilmRecycleViewAdapter;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    FilmRecycleViewAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NamesFieldsList.init(this);
        FilmDataFactory factory = new FilmDataFactory(new FilmFileStorage(this));

        PagedList.Config config = new PagedList.Config.Builder()
                .setEnablePlaceholders(false)
                .setPageSize(10)
                .build();

        adapter = new FilmRecycleViewAdapter(Film.DIFF_CALLBACK);

        new LivePagedListBuilder(factory, config)
                .setFetchExecutor(Executors.newSingleThreadExecutor())
                .build()
                .observe(this, new Observer<PagedList<Film>>() {
                    @Override
                    public void onChanged(PagedList<Film> films) {
                        adapter.submitList(films);
                    }
                });

        recyclerView = new RecyclerView(this);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
    }
}
