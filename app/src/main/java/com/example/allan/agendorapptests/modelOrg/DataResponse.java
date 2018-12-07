package com.example.allan.agendorapptests.modelOrg;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataResponse {

    @SerializedName("data")
    private List<Organization> data;


    public List<Organization> getData() {
        return data;
    }

    public void setData(List<Organization> data) {
        this.data = data;
    }
}
