package com.gm.commits.data.network.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ryellap on 4/17/18.
 */

public class RetrofitInstance {
    private static final String BASE_URL = "https://api.github.com";

    static Retrofit retrofit = null;

    /**
     *
     * @return
     */
    public static Retrofit getRetrofitInstance() {
        retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory
                        .create())
                .build();
        return retrofit;
    }

}
