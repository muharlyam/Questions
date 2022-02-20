package com.muharlyam.mplearning.repository;

import com.google.gson.Gson;
import com.muharlyam.mplearning.model.Question;
import com.muharlyam.mplearning.retrofit.RetrofitService;
import com.muharlyam.mplearning.viewmodel.QuestionViewModel;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class NetworkRepository {

    private final static String BASE_URL = "http://jservice.io/";

    private final RetrofitService retrofitService;
    QuestionViewModel questionViewModel;
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

    public void getRandomQuestion() {
        final Call<List<Question>> requestCall = retrofitService.getRandom();
        requestCall.enqueue(new Callback<List<Question>>() {
            @Override
            public void onResponse(Call<List<Question>> call, Response<List<Question>> response) {
                if(response.isSuccessful()) {
                    try {
                        QuestionViewModel.addString(call.execute().body().get(0).getQuestion());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Question>> call, Throwable t) {
                QuestionViewModel.addString("Не удалос");
            }
        });
    }
}
