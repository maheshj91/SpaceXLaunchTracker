package com.spacex.tracker.service.interfaces;

import com.spacex.tracker.view.model.Launches;
import com.spacex.tracker.view.model.Missions;
import com.spacex.tracker.view.model.RocketDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/*
*   Interface class for api hitting
* */
public interface LaunchApi {

    //URL :- https://api.spacexdata.com/v3/

    @GET("launches")
    Call<List<Launches>> getAllLaunches();

    @GET("rockets/{id}")
    Call<RocketDetails> getRocketDetails(@Path("id") String id);

    @GET("missions/{id}")
    Call<Missions> getMissions(@Path("id") String id);

    @GET("rockets")
    Call<List<RocketDetails>> getAllRocketDetails();

    @GET("missions")
    Call<List<Missions>> getAllMissions();
}
