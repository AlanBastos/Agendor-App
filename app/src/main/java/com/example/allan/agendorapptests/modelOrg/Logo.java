package com.example.allan.agendorapptests.modelOrg;

import com.google.gson.annotations.SerializedName;

public class Logo {

    @SerializedName("full")
    private String full;

    @SerializedName("thumb")
    private String thumb;

    @SerializedName("thumb_large")
    private String thumbLarge;

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getThumbLarge() {
        return thumbLarge;
    }

    public void setThumbLarge(String thumbLarge) {
        this.thumbLarge = thumbLarge;
    }

}
