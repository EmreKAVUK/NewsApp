package com.emre.newsapp;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {
    private static Retrofit retrofit =null;//REST(Representational State Transfer)uzak sistemdeki mantıksal kaynakları HTTP protokolü ile GET, POST, PUT, PATCH, DELETE methodlarını çağırarak kullanmaktır.
    public static ApiInterface getApiInterface(){
        if(retrofit == null){//retrofit yaratılmamışsa yarat
            retrofit = new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }//JSON çıktılarını POJO classlara dönüştürmek için GSON kullanacağız. Retrofit bize GSON için ayrı bir converter kütüphanesi sağlıyor.
        return retrofit.create(ApiInterface.class);
    }
}
