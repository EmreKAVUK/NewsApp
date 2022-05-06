package com.emre.newsapp;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface ApiInterface {
    String BASE_URL = "https://newsapi.org/v2/";
    @GET("top-headlines")//genel haberleri getirmek için ANASAYFA
    Call<mainNews> getNews(
            @Query("country") String country,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey);

    @GET("top-headlines")//belirli haberleri getirmek için  SPOR EGLENCE BILIM VS Kategorılerı ıcın
    Call<mainNews> getCategoryNews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey);
}
