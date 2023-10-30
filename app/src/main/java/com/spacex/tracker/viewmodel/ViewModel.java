package com.spacex.tracker.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.spacex.tracker.view.dao.repo.LaunchesRepository;
import com.spacex.tracker.view.dao.repo.MissionRepository;
import com.spacex.tracker.view.dao.repo.RocketRepository;
import com.spacex.tracker.view.model.Launches;
import com.spacex.tracker.view.model.Missions;
import com.spacex.tracker.view.model.RocketDetails;

import java.util.List;

public class ViewModel extends AndroidViewModel {

    // creating a new variable for Launch repository.
    private LaunchesRepository repository;
    // creating a new variable for Mission repository.
    private MissionRepository missionRepository;

    // creating a new variable for Rocket repository.
    private RocketRepository rocketRepository;

    // below line is to create a variable for live
    // data where all the Launch data are present.
    private LiveData<List<Launches>> allLaunches;

    // below line is to create a variable for mission
    // data where mission data will present based on mission id.
    private Missions missions;

    // below line is to create a variable for rocket details
    // where rocket details will present based on rocket id.
    private RocketDetails rocketDetails;


    // constructor for our view modal.
    public ViewModel(@NonNull Application application) {
        super(application);
        repository = new LaunchesRepository(application);
        missionRepository = new MissionRepository(application);
        rocketRepository = new RocketRepository(application);
        allLaunches = repository.getAllLaunches();
    }

    // below method is use to insert the data to our repository.
    public void insert(Launches launches) {
        repository.insert(launches);
    }

    // below method is use to insert mission data to our repository.
    public void insert(Missions missions) {
        missionRepository.insert(missions);
    }

    // below method is use to insert rocket details to our repository.
    public void insert(RocketDetails rocketDetails) {
        rocketRepository.insert(rocketDetails);
    }

    // below line is to update data in our repository.
    public void update(Launches launches) {
        repository.update(launches);
    }

    // below line is to delete the data in our repository.
    public void delete(Launches launches) {
        repository.delete(launches);
    }

    // below method is to delete all the launch data in our list.
    public void deleteAllLaunches() {
        repository.deleteAllLaunches();
    }

    // below method is to get all the launch data in our list.
    public LiveData<List<Launches>> getAllLaunches() {
        return allLaunches;
    }

    // below method is to get mission data based on id in our list.
    public LiveData<Missions> getMissions(String missionId) {
        return missionRepository.getMissionById(missionId);
    }

    // below method is to get rocket details based on id in our list.
    public LiveData<RocketDetails> getRocketDetails(String rocketID) {
        return rocketRepository.getRocketDetailsById(rocketID);
    }
}
