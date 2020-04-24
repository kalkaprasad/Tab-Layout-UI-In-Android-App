package com.devi.tablayout.calldetails;

public class calldata {


    String callername;
    String callingtime;
    int callerprofile;
    int missedcallicon;

    public calldata(String callername, String callingtime, int callerprofile, int missedcallicon) {
        this.callername = callername;
        this.callingtime = callingtime;
        this.callerprofile = callerprofile;
        this.missedcallicon = missedcallicon;
    }

    public String getCallername() {
        return callername;
    }

    public void setCallername(String callername) {
        this.callername = callername;
    }

    public String getCallingtime() {
        return callingtime;
    }

    public void setCallingtime(String callingtime) {
        this.callingtime = callingtime;
    }

    public int getCallerprofile() {
        return callerprofile;
    }

    public void setCallerprofile(int callerprofile) {
        this.callerprofile = callerprofile;
    }

    public int getMissedcallicon() {
        return missedcallicon;
    }

    public void setMissedcallicon(int missedcallicon) {
        this.missedcallicon = missedcallicon;
    }
}
