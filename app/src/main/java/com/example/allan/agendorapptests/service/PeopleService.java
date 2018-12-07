package com.example.allan.agendorapptests.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PeopleService {

    String BASE_URL = "https://api.agendor.com.br/v3/";

    private Retrofit retrofit = null;

    public Retrofit getPeople() {


        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }


        return retrofit;
    }
}
