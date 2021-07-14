package com.firestudio.projectgmda.network;

import com.firestudio.projectgmda.modal.GmdaLayer;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LayerInterface {

    @GET("?f=json")
    Call<GmdaLayer> getLayer();

}
