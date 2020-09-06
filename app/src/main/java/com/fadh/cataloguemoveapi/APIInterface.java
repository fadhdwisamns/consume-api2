package com.fadh.cataloguemoveapi;

import com.fadh.cataloguemoveapi.model.Model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIInterface {
    @GET("movie/top_rated")
    Call<Model> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<Model> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
