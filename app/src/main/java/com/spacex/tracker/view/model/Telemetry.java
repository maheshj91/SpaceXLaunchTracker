package com.spacex.tracker.view.model;

public class Telemetry {

    private String flight_club;

    public Telemetry(String flight_club) {
        this.flight_club = flight_club;
    }

    public String getFlight_club() {
        return flight_club;
    }

    public void setFlight_club(String flight_club) {
        this.flight_club = flight_club;
    }
}
