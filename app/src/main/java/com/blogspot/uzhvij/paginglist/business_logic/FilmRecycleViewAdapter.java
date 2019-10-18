package com.blogspot.uzhvij.paginglist.business_logic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import com.blogspot.uzhvij.paginglist.R;
import com.blogspot.uzhvij.paginglist.model.Film;

import java.util.Objects;

public class FilmRecycleViewAdapter extends PagedListAdapter<Film, FilmViewHolder> {

    public FilmRecycleViewAdapter(DiffUtil.ItemCallback<Film> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public FilmViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_item, parent, false);
        return new FilmViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FilmViewHolder holder, int position) {
        holder.bind(Objects.requireNonNull(getItem(position)));
    }
}