package com.spacex.tracker.view.ui.view;

import static com.spacex.tracker.utils.Constants.MISSION_DATA;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.google.gson.Gson;
import com.spacex.tracker.databinding.ActivityMainBinding;
import com.spacex.tracker.service.api.TrackerApi;
import com.spacex.tracker.view.dao.db.SharedPref;
import com.spacex.tracker.view.model.Launches;
import com.spacex.tracker.view.model.Missions;
import com.spacex.tracker.view.model.RocketDetails;
import com.spacex.tracker.view.ui.adapter.LaunchAdapter;
import com.spacex.tracker.viewmodel.ViewModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ViewModel viewModel;
    private LaunchAdapter adapter;
    private boolean initialLoad = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SharedPref.init(MainActivity.this);

        // passing a data from view modal.
        viewModel = new ViewModelProvider(this).get(ViewModel.class);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        setupRecyclerView();
        dataObserver();
        setListener();
    }

    private void setupRecyclerView() {
        adapter = new LaunchAdapter();
        binding.rvLaunches.setAdapter(adapter);
        binding.rvLaunches.setHasFixedSize(true);
    }

    /*
    * Observes data changes into launch database table and notify an activity if any changes occur
    * in database table
    * */
    private void dataObserver() {
        viewModel.getAllLaunches().observe(this, launches -> {
            adapter.submitList(launches);

            if (!initialLoad) {
                binding.pullToRefresh.setRefreshing(true);
                initialLoad = true;
                fetchDataFromServer();
            }
        });
    }

    private void setListener() {
        binding.pullToRefresh.setOnRefreshListener(this::fetchDataFromServer);

        adapter.setOnItemClickListener(launches -> {
            Gson gson = new Gson();
            Bundle bundle = new Bundle();
            bundle.putString(MISSION_DATA, gson.toJson(launches));
            Intent intent = new Intent(MainActivity.this, LaunchDetailActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }

    /*
    * fetch new launch data from server when activated
    * */
    private void fetchDataFromServer() {
        Call<List<Launches>> launch = TrackerApi.getLaunches().getAllLaunches();
        launch.enqueue(new Callback<List<Launches>>() {
            @Override
            public void onResponse(@NonNull Call<List<Launches>> call, @NonNull Response<List<Launches>> response) {
                if (response.isSuccessful()) {
                    if (null != response.body()) {
                        if (!response.body().isEmpty()) {
                            for (Launches launches : response.body()) {
                                viewModel.insert(launches);
                            }
                        }
                    }
                }
                binding.pullToRefresh.setRefreshing(false);
                fetchMissionsData();
                fetchRocketData();
            }

            @Override
            public void onFailure(@NonNull Call<List<Launches>> call, @NonNull Throwable t) {
                Log.i("Tracker", "Launches on failure : " + t.getMessage());
                binding.pullToRefresh.setRefreshing(false);
            }
        });
    }

    /*
     * fetch new mission data from server when activated
     * */
    private void fetchMissionsData() {
        Call<List<Missions>> missions = TrackerApi.getLaunches().getAllMissions();
        missions.enqueue(new Callback<List<Missions>>() {
            @Override
            public void onResponse(Call<List<Missions>> call, Response<List<Missions>> response) {
                if (response.isSuccessful()) {
                    if (null != response.body()) {
                        if (!response.body().isEmpty()) {
                            for (Missions missions : response.body()) {
                                viewModel.insert(missions);
                            }
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Missions>> call, Throwable t) {
                Log.i("Tracker", "Launches on failure : " + t.getMessage());
            }
        });
    }

    /*
     * fetch new rocket details from server when activated
     * */
    private void fetchRocketData() {
        Call<List<RocketDetails>> rocket = TrackerApi.getLaunches().getAllRocketDetails();
        rocket.enqueue(new Callback<List<RocketDetails>>() {
            @Override
            public void onResponse(Call<List<RocketDetails>> call, Response<List<RocketDetails>> response) {
                if (response.isSuccessful()) {
                    if (null != response.body()) {
                        if (!response.body().isEmpty()) {
                            for (RocketDetails rocketDetails : response.body()) {
                                viewModel.insert(rocketDetails);
                            }
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<List<RocketDetails>> call, Throwable t) {
                Log.i("ROCKET", "ROcket Data Size (t.getMessage())" + t.getMessage());
            }
        });
    }
}
