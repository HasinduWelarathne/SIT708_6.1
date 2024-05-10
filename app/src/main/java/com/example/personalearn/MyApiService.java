package com.example.personalearn;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MyApiService {
    @GET("getQuiz")
    Call<QuizQueDataModel> getQuizData(@Query("topic") String topic);
}
