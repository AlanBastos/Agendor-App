package com.example.allan.agendorapptests.modelOrg;

import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("country")
    private String country;


    @SerializedName("district")
    private String district;

    @SerializedName("streetName")
    private String streetName;

    @SerializedName("streetNumber")
    private Integer streetNumber;

    @SerializedName("additionalInfo")
    private Object additionalInfo;

    @SerializedName("postalCode")
    private String postalCode;

    @SerializedName("state")
    private String state;

    @SerializedName("city")
    private String city;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public Object getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Object additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
