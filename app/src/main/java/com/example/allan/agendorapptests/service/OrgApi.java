package com.example.allan.agendorapptests.service;

import com.example.allan.agendorapptests.modelOrg.DataResponse;
import com.example.allan.agendorapptests.modelOrg.Organization;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface OrgApi {

    @Headers("Authorization: Token 19c7fe22-741d-4b75-b091-52f64c9355ed")
    @GET("organizations")
    Call<DataResponse> getResults();

    @Headers("Authorization: Token 19c7fe22-741d-4b75-b091-52f64c9355ed")
    @GET("organizations/{id}")
    Call<DataResponse> getOrganization(@Path("id") String id);
}
