package com.muharlyam.mplearning.retrofit;

import com.muharlyam.mplearning.model.Question;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitService {

    @GET("api/random/")
    Call<List<Question>> getRandom();

}
