package com.devi.tablayout.statusdata;

public class recent_status_info {

    String status_userName;
    String StstusDuration;
    int statususer_profile_pic;

    public recent_status_info(String status_userName, String ststusDuration, int statususerName) {
        this.status_userName = status_userName;
        StstusDuration = ststusDuration;
        this.statususer_profile_pic = statususerName;
    }

    public String getStatus_userName() {
        return status_userName;
    }

    public void setStatus_userName(String status_userName) {
        this.status_userName = status_userName;
    }

    public String getStstusDuration() {
        return StstusDuration;
    }

    public void setStstusDuration(String ststusDuration) {
        StstusDuration = ststusDuration;
    }

    public int getStatususer_profile_pic() {
        return statususer_profile_pic;
    }

    public void setStatususer_profile_pic(int statususer_profile_pic) {
        this.statususer_profile_pic = statususer_profile_pic;
    }
}
