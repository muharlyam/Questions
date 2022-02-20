package com.muharlyam.mplearning.retrofit;

import com.muharlyam.mplearning.model.Question;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface RetrofitService {

    @GET("api/random")
    Call<List<Question>> getRandom();

}
