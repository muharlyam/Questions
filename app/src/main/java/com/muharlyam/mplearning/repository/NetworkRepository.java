package com.muharlyam.mplearning.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.muharlyam.mplearning.model.Question;
import com.muharlyam.mplearning.retrofit.RetrofitService;
import com.muharlyam.mplearning.viewmodel.QuestionViewModel;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class NetworkRepository {

    private final static String BASE_URL = "http://jservice.io";

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
        final Call<ResponseBody> requestCall = retrofitService.getRandom();
        requestCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.isSuccessful()) {
                    try {
                        List<Question> questions = gson.fromJson(call.execute().body().string(), new TypeToken<List<Question>>(){}.getType());
                        QuestionViewModel.addString(questions.get(0).getQuestion());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                QuestionViewModel.addString("Не удалос");
            }
        });
    }
}
