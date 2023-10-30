package com.spacex.tracker.view.dao.converter;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.spacex.tracker.view.model.LaunchFailureDetails;
import com.spacex.tracker.view.model.LaunchSites;
import com.spacex.tracker.view.model.Links;
import com.spacex.tracker.view.model.Rocket;
import com.spacex.tracker.view.model.RocketDetails;
import com.spacex.tracker.view.model.Telemetry;
import com.spacex.tracker.view.model.Timeline;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Type converters to allow Room to reference complex data types.
 */
public class Converters {

    private final Gson gson = new Gson();

    @TypeConverter
    public List<String> stringToMissionId(String data) {
        if (data.isEmpty()) {
            return new ArrayList<>();
        }

        Type listType = new TypeToken<List<String>>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String missionIdToString(List<String> data) {
        return (data == null) ? "" : gson.toJson(data);
    }

    @TypeConverter
    public Rocket stringToRocket(String data) {
        if (data.isEmpty()) {
            return null;
        }

        Type listType = new TypeToken<Rocket>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String rocketToString(Rocket data) {
        return (data == null) ? "" : gson.toJson(data);
    }

    @TypeConverter
    public Telemetry stringToTelemetry(String data) {
        if (data.isEmpty()) {
            return null;
        }

        Type listType = new TypeToken<Telemetry>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String telemetryToString(Telemetry data) {
        return (data == null) ? "" : gson.toJson(data);
    }

    @TypeConverter
    public LaunchSites stringToLaunchSites(String data) {
        if (data.isEmpty()) {
            return null;
        }

        Type listType = new TypeToken<LaunchSites>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String launchSitesToString(LaunchSites data) {
        return (data == null) ? "" : gson.toJson(data);
    }

    @TypeConverter
    public LaunchFailureDetails stringToLaunchFailureDetails(String data) {
        if (data.isEmpty()) {
            return null;
        }

        Type listType = new TypeToken<LaunchFailureDetails>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String launchFailureDetailsToString(LaunchFailureDetails data) {
        return (data == null) ? "" : gson.toJson(data);
    }

    @TypeConverter
    public Links stringToLinks(String data) {
        if (data.isEmpty()) {
            return null;
        }

        Type listType = new TypeToken<Links>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String linksToString(Links data) {
        return (data == null) ? "" : gson.toJson(data);
    }

    @TypeConverter
    public Timeline stringToTimeline(String data) {
        if (data.isEmpty()) {
            return null;
        }

        Type listType = new TypeToken<Timeline>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String timelineToString(Timeline data) {
        return (data == null) ? "" : gson.toJson(data);
    }

    @TypeConverter
    public RocketDetails.Height stringToHeight(String data) {
        if (data.isEmpty()) {
            return null;
        }

        Type listType = new TypeToken<RocketDetails.Height>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String heightToString(RocketDetails.Height data) {
        return (data == null) ? "" : gson.toJson(data);
    }

    @TypeConverter
    public RocketDetails.Diameter stringToDiameter(String data) {
        if (data.isEmpty()) {
            return null;
        }

        Type listType = new TypeToken<RocketDetails.Diameter>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String diameterToString(RocketDetails.Diameter data) {
        return (data == null) ? "" : gson.toJson(data);
    }

    @TypeConverter
    public RocketDetails.Mass stringToMass(String data) {
        if (data.isEmpty()) {
            return null;
        }

        Type listType = new TypeToken<RocketDetails.Mass>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String massToString(RocketDetails.Mass data) {
        return (data == null) ? "" : gson.toJson(data);
    }

    @TypeConverter
    public List<RocketDetails.PayloadWeights> stringToPayloadWeights(String data) {
        if (data.isEmpty()) {
            return new ArrayList<>();
        }

        Type listType = new TypeToken<List<RocketDetails.PayloadWeights>>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String payloadWeightsToString(List<RocketDetails.PayloadWeights> data) {
        return (data == null) ? "" : gson.toJson(data);
    }

    @TypeConverter
    public RocketDetails.FirstStage stringToFirstStage(String data) {
        if (data.isEmpty()) {
            return null;
        }

        Type listType = new TypeToken<RocketDetails.FirstStage>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String firstStageToString(RocketDetails.FirstStage data) {
        return (data == null) ? "" : gson.toJson(data);
    }

    @TypeConverter
    public RocketDetails.SecondStage stringToSecondStage(String data) {
        if (data.isEmpty()) {
            return null;
        }

        Type listType = new TypeToken<RocketDetails.SecondStage>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String secondStageToString(RocketDetails.SecondStage data) {
        return (data == null) ? "" : gson.toJson(data);
    }

    @TypeConverter
    public RocketDetails.Engines stringToEngines(String data) {
        if (data.isEmpty()) {
            return null;
        }

        Type listType = new TypeToken<RocketDetails.Engines>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String enginesToString(RocketDetails.Engines data) {
        return (data == null) ? "" : gson.toJson(data);
    }

    @TypeConverter
    public RocketDetails.LandingLegs stringToLandingLegs(String data) {
        if (data.isEmpty()) {
            return null;
        }

        Type listType = new TypeToken<RocketDetails.LandingLegs>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String landingLegsToString(RocketDetails.LandingLegs data) {
        return (data == null) ? "" : gson.toJson(data);
    }
}
