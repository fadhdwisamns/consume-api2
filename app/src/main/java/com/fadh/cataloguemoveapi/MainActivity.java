package com.fadh.cataloguemoveapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Movie;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.fadh.cataloguemoveapi.model.Model;
import com.fadh.cataloguemoveapi.model.Rating;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    private final static String API_KEY = "aac2f6b6";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please obtain your API KEY first from themoviedb.org", Toast.LENGTH_LONG).show();
            return;
        }
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.movie_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        APIInterface apiService = ApiClient.getClient().create(APIInterface.class);

        Call<Model> call = apiService.getTopRatedMovies(API_KEY);
        call.enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {
//                List<Movie> movies = response.body().getResults();
                List<Rating> ratings = response.body().getRatings();
                Log.d(TAG, "Number of movies received: " + ratings.size());
                Toast.makeText(MainActivity.this, "Number of movies received: " + ratings.size(), Toast.LENGTH_LONG).show();

            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });



    }
}
