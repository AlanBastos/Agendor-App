package com.example.allan.agendorapptests.service;

import com.example.allan.agendorapptests.modelPeople.DataResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface PeopleApi {

    @Headers("Authorization: Token 19c7fe22-741d-4b75-b091-52f64c9355ed")
    @GET("people")
    Call<DataResponse> getResults();

    @Headers("Authorization: Token 19c7fe22-741d-4b75-b091-52f64c9355ed")
    @GET("people/{id}")
    Call<DataResponse> getPeople(@Path("id") String id);
}
