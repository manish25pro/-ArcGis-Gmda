package com.firestudio.projectgmda.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkClientRetrofit {
    public static Retrofit retrofit = null;

    private NetworkClientRetrofit() {


    }

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl("https://onemapggm.gmda.gov.in/server/rest/services/Temporary/Editable_Layers/FeatureServer/").addConverterFactory(GsonConverterFactory.create()).build();
        }
    return  retrofit;
    }



}
