package com.spacex.tracker.view.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "launches")
public class Launches {

    @PrimaryKey
    private int flight_number;
    private String mission_name;
    private List<String> mission_id;
    private boolean upcoming;
    private String launch_year;
    private long launch_date_unix;
    private String launch_date_utc;
    private String launch_date_local;
    private boolean is_tentative;
    private String tentative_max_precision;
    private boolean tbd;
    private int launch_window;

    private Rocket rocket;
    private List<String> ships;
    private Telemetry telemetry;
    private LaunchSites launch_site;
    private Boolean launch_success;
    private LaunchFailureDetails launch_failure_details;
    private Links links;

    private String details;

    private String static_fire_date_utc;
    private long static_fire_date_unix;

    private Timeline timeline;

    public Launches(int flight_number, String mission_name, List<String> mission_id, boolean upcoming, String launch_year, long launch_date_unix, String launch_date_utc, String launch_date_local, boolean is_tentative, String tentative_max_precision, boolean tbd, int launch_window, Rocket rocket, List<String> ships, Telemetry telemetry, LaunchSites launch_site, Boolean launch_success, LaunchFailureDetails launch_failure_details, Links links, String details, String static_fire_date_utc, long static_fire_date_unix, Timeline timeline) {
        this.flight_number = flight_number;
        this.mission_name = mission_name;
        this.mission_id = mission_id;
        this.upcoming = upcoming;
        this.launch_year = launch_year;
        this.launch_date_unix = launch_date_unix;
        this.launch_date_utc = launch_date_utc;
        this.launch_date_local = launch_date_local;
        this.is_tentative = is_tentative;
        this.tentative_max_precision = tentative_max_precision;
        this.tbd = tbd;
        this.launch_window = launch_window;
        this.rocket = rocket;
        this.ships = ships;
        this.telemetry = telemetry;
        this.launch_site = launch_site;
        this.launch_success = launch_success;
        this.launch_failure_details = launch_failure_details;
        this.links = links;
        this.details = details;
        this.static_fire_date_utc = static_fire_date_utc;
        this.static_fire_date_unix = static_fire_date_unix;
        this.timeline = timeline;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public String getMission_name() {
        return mission_name;
    }

    public void setMission_name(String mission_name) {
        this.mission_name = mission_name;
    }

    public List<String> getMission_id() {
        return mission_id;
    }

    public void setMission_id(List<String> mission_id) {
        this.mission_id = mission_id;
    }

    public boolean isUpcoming() {
        return upcoming;
    }

    public void setUpcoming(boolean upcoming) {
        this.upcoming = upcoming;
    }

    public String getLaunch_year() {
        return launch_year;
    }

    public void setLaunch_year(String launch_year) {
        this.launch_year = launch_year;
    }

    public long getLaunch_date_unix() {
        return launch_date_unix;
    }

    public void setLaunch_date_unix(long launch_date_unix) {
        this.launch_date_unix = launch_date_unix;
    }

    public String getLaunch_date_utc() {
        return launch_date_utc;
    }

    public void setLaunch_date_utc(String launch_date_utc) {
        this.launch_date_utc = launch_date_utc;
    }

    public String getLaunch_date_local() {
        return launch_date_local;
    }

    public void setLaunch_date_local(String launch_date_local) {
        this.launch_date_local = launch_date_local;
    }

    public boolean isIs_tentative() {
        return is_tentative;
    }

    public void setIs_tentative(boolean is_tentative) {
        this.is_tentative = is_tentative;
    }

    public String getTentative_max_precision() {
        return tentative_max_precision;
    }

    public void setTentative_max_precision(String tentative_max_precision) {
        this.tentative_max_precision = tentative_max_precision;
    }

    public boolean isTbd() {
        return tbd;
    }

    public void setTbd(boolean tbd) {
        this.tbd = tbd;
    }

    public int getLaunch_window() {
        return launch_window;
    }

    public void setLaunch_window(int launch_window) {
        this.launch_window = launch_window;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public List<String> getShips() {
        return ships;
    }

    public void setShips(List<String> ships) {
        this.ships = ships;
    }

    public Telemetry getTelemetry() {
        return telemetry;
    }

    public void setTelemetry(Telemetry telemetry) {
        this.telemetry = telemetry;
    }

    public LaunchSites getLaunch_site() {
        return launch_site;
    }

    public void setLaunch_site(LaunchSites launch_site) {
        this.launch_site = launch_site;
    }

    public Boolean isLaunch_success() {
        return launch_success;
    }

    public void setLaunch_success(Boolean launch_success) {
        this.launch_success = launch_success;
    }

    public LaunchFailureDetails getLaunch_failure_details() {
        return launch_failure_details;
    }

    public void setLaunch_failure_details(LaunchFailureDetails launch_failure_details) {
        this.launch_failure_details = launch_failure_details;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatic_fire_date_utc() {
        return static_fire_date_utc;
    }

    public void setStatic_fire_date_utc(String static_fire_date_utc) {
        this.static_fire_date_utc = static_fire_date_utc;
    }

    public long getStatic_fire_date_unix() {
        return static_fire_date_unix;
    }

    public void setStatic_fire_date_unix(long static_fire_date_unix) {
        this.static_fire_date_unix = static_fire_date_unix;
    }

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }
}
