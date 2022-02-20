package com.muharlyam.mplearning.repository;

import com.google.gson.Gson;
import com.muharlyam.mplearning.model.Question;
import com.muharlyam.mplearning.retrofit.RetrofitService;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class NetworkRepository {

    private final static String BASE_URL = "http://jservice.io/";

    private final RetrofitService retrofitService;
    private final Gson gson;


    public NetworkRepository() {
        gson = new Gson();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofitService = retrofit.create(RetrofitService.class);
    }

    public Question getRandomQuestion() {
        try {
            Response<List<Question>> response = retrofitService.getRandom().execute();
            if(response.isSuccessful()) {
                List<Question> questions = response.body();
                return questions.get(0);
            } else {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
