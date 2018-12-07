package com.example.allan.agendorapptests.modelPeople;

import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("email")
    private String email;

    @SerializedName("work")
    private String work;

    @SerializedName("mobile")
    private String mobile;

    @SerializedName("fax")
    private Object fax;
    @SerializedName("ramal")

    private Object ramal;
    @SerializedName("radio")

    private Object radio;
    @SerializedName("whatsapp")

    private Object whatsapp;
    @SerializedName("facebook")

    private Object facebook;
    @SerializedName("twitter")

    private Object twitter;
    @SerializedName("linkedIn")

    private Object linkedIn;
    @SerializedName("skype")

    private Object skype;
    @SerializedName("instagram")

    private Object instagram;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Object getFax() {
        return fax;
    }

    public void setFax(Object fax) {
        this.fax = fax;
    }

    public Object getRamal() {
        return ramal;
    }

    public void setRamal(Object ramal) {
        this.ramal = ramal;
    }

    public Object getRadio() {
        return radio;
    }


    public void setRadio(Object radio) {
        this.radio = radio;
    }

    public Object getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(Object whatsapp) {
        this.whatsapp = whatsapp;
    }

    public Object getFacebook() {
        return facebook;
    }

    public void setFacebook(Object facebook) {
        this.facebook = facebook;
    }

    public Object getTwitter() {
        return twitter;
    }

    public void setTwitter(Object twitter) {
        this.twitter = twitter;
    }

    public Object getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(Object linkedIn) {
        this.linkedIn = linkedIn;
    }

    public Object getSkype() {
        return skype;
    }

    public void setSkype(Object skype) {
        this.skype = skype;
    }

    public Object getInstagram() {
        return instagram;
    }

    public void setInstagram(Object instagram) {
        this.instagram = instagram;
    }
}
