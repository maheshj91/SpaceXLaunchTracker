package com.spacex.tracker.view.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "missions")
public class Missions {

    @PrimaryKey
    @NonNull
    private String mission_id;
    private String mission_name;
    private String wikipedia;
    private String website;
    private String twitter;
    private String description;

    private List<String> manufacturers;
    private List<String> payload_ids;

    public Missions(String mission_id, String mission_name, String wikipedia, String website, String twitter, String description, List<String> manufacturers, List<String> payload_ids) {
        this.mission_id = mission_id;
        this.mission_name = mission_name;
        this.wikipedia = wikipedia;
        this.website = website;
        this.twitter = twitter;
        this.description = description;
        this.manufacturers = manufacturers;
        this.payload_ids = payload_ids;
    }

    public String getMission_id() {
        return mission_id;
    }

    public void setMission_id(String mission_id) {
        this.mission_id = mission_id;
    }

    public String getMission_name() {
        return mission_name;
    }

    public void setMission_name(String mission_name) {
        this.mission_name = mission_name;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<String> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public List<String> getPayload_ids() {
        return payload_ids;
    }

    public void setPayload_ids(List<String> payload_ids) {
        this.payload_ids = payload_ids;
    }
}
