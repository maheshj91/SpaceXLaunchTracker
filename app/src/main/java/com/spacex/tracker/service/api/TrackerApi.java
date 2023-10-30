package com.spacex.tracker.service.api;

import com.spacex.tracker.service.interfaces.LaunchApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SuppressWarnings("InstantiationOfUtilityClass")
public class TrackerApi {

    private static TrackerApi trackerInstance;
    private static Retrofit apiInstance;

    private static TrackerApi getTrackerInstance() {
        if (trackerInstance == null) {
            trackerInstance = new TrackerApi();
            apiInstance = getInstance();
        }
        return trackerInstance;
    }

    /*
    *  Initializing retrofit instance for APi hitting
    * */
    private static synchronized Retrofit getInstance() {
        if (apiInstance == null) {
            apiInstance = new Retrofit.Builder()
                    .baseUrl("https://api.spacexdata.com/v3/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return apiInstance;
    }

    public static LaunchApi getLaunches() {
        getInstance();
        return apiInstance.create(LaunchApi.class);
    }
}
