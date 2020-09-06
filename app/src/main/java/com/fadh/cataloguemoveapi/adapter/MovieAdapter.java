package com.fadh.cataloguemoveapi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.fadh.cataloguemoveapi.R;
import com.fadh.cataloguemoveapi.model.Model;
import com.fadh.cataloguemoveapi.model.Rating;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private List<Model> models;
    private int rowLayout;
    private Context context;
    @NonNull
    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.movieTitle.setText(models.get(position).getTitle());
        holder.data.setText(models.get(position).getGenre());
        holder.movieDescription.setText(models.get(position).getActors());
        holder.rating.setText(models.get(position).getRatings().toString());
        Picasso.get().load("https://image.tmdb.org/t/p/w300_and_h450_bestv2" + models.get(position).getPoster()).resize(200, 250).into(holder.backbg);

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        LinearLayout moviesLayout;
        TextView movieTitle;
        TextView data;
        TextView movieDescription;
        TextView rating;
        ImageView backbg;

        public MovieViewHolder(@NonNull View v) {
            super(v);
            moviesLayout = (LinearLayout) v.findViewById(R.id.movies_layout);
            movieTitle = (TextView) v.findViewById(R.id.title);
            data = (TextView) v.findViewById(R.id.subtitle);
            movieDescription = (TextView) v.findViewById(R.id.description);
            rating = (TextView) v.findViewById(R.id.rating);
            backbg = (ImageView) v.findViewById(R.id.backbg);
        }
    }
    public MovieAdapter(List<Model> models, int rowLayout, Context context) {
        this.models = models;
        this.rowLayout = rowLayout;
        this.context = context;

    }
}
