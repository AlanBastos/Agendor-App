package com.example.allan.agendorapptests.modelPeople;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataResponse {

    @SerializedName("data")
    private List<People> data;

    public List<People> getData() {
        return data;
    }


    public void setData(List<People> data) {
        this.data = data;
    }
}
