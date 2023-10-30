package com.spacex.tracker.view.model;

public class LaunchFailureDetails {

    private int time;
    private int altitude;
    private String reason;

    public LaunchFailureDetails(int time, int altitude, String reason) {
        this.time = time;
        this.altitude = altitude;
        this.reason = reason;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
