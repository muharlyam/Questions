package com.muharlyam.mplearning.retrofit;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitService {

    @GET("/api/random/")
    Call<ResponseBody> getRandom();

}
