package com.devi.tablayout.statusdata;

public class vieved_status_info {
    String ststus_username;
    String status_duration;
    int ststususerPhoto;

    public vieved_status_info(String ststus_username, String status_duration, int ststususerPhoto) {
        this.ststus_username = ststus_username;
        this.status_duration = status_duration;
        this.ststususerPhoto = ststususerPhoto;
    }

    public String getStstus_username() {
        return ststus_username;
    }

    public void setStstus_username(String ststus_username) {
        this.ststus_username = ststus_username;
    }

    public String getStatus_duration() {
        return status_duration;
    }

    public void setStatus_duration(String status_duration) {
        this.status_duration = status_duration;
    }

    public int getStstususerPhoto() {
        return ststususerPhoto;
    }

    public void setStstususerPhoto(int ststususerPhoto) {
        this.ststususerPhoto = ststususerPhoto;
    }
}
