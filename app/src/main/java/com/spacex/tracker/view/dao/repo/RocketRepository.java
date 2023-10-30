package com.spacex.tracker.view.dao.repo;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.spacex.tracker.view.dao.db.TrackerDatabase;
import com.spacex.tracker.view.dao.interfaces.RocketDao;
import com.spacex.tracker.view.model.RocketDetails;

import java.util.List;

@SuppressWarnings("ALL")
public class RocketRepository {

    // below line is the create a variable
    // for dao and list for all launches.
    private final RocketDao rocketDao;
    private final LiveData<List<RocketDetails>> allRocketDetails;

    private RocketDetails rocketDetails;

    // creating a constructor for our variables
    // and passing the variables to it.
    public RocketRepository(Application application) {
        TrackerDatabase database = TrackerDatabase.getInstance(application);
        rocketDao = database.rocketDao();
        allRocketDetails = rocketDao.getAllRocketDetails();
    }

    // creating a method to insert the data to our database.
    public void insert(RocketDetails rocketDetails) {
        new InsertMissionAsyncTask(rocketDao).execute(rocketDetails);
    }

    // creating a method to update data in database.
    public void update(RocketDetails rocketDetails) {
        new UpdateMissionAsyncTask(rocketDao).execute(rocketDetails);
    }

    // creating a method to delete the data in our database.
    public void delete(RocketDetails rocketDetails) {
        new DeleteMissionAsyncTask(rocketDao).execute(rocketDetails);
    }

    // below is the method to delete all the missions.
    public void deleteAllCourses() {
        new DeleteAllMissionsAsyncTask(rocketDao).execute();
    }

    // below method is to read all the missions.
    public LiveData<List<RocketDetails>> getAllRocketDetails() {
        return allRocketDetails;
    }

    public LiveData<RocketDetails> getRocketDetailsById(String rocketId) {
        return rocketDao.getRocketDetailById(rocketId);
    }

    // we are creating a async task method to insert new mission data.
    private static class InsertMissionAsyncTask extends AsyncTask<RocketDetails, Void, Void> {
        private final RocketDao rocketDao;

        private InsertMissionAsyncTask(RocketDao rocketDao) {
            this.rocketDao = rocketDao;
        }

        @Override
        protected Void doInBackground(RocketDetails... rocketDetails) {
            // below line is use to insert our modal in dao.
            rocketDao.insert(rocketDetails[0]);
            return null;
        }
    }

    // we are creating a async task method to update our mission data.

    private static class UpdateMissionAsyncTask extends AsyncTask<RocketDetails, Void, Void> {
        private final RocketDao rocketDao;

        private UpdateMissionAsyncTask(RocketDao rocketDao) {
            this.rocketDao = rocketDao;
        }

        @Override
        protected Void doInBackground(RocketDetails... rocketDetails) {
            // below line is use to update
            // our rocketDao in dao.
            rocketDao.update(rocketDetails[0]);
            return null;
        }
    }

    // we are creating a async task method to delete mission data.
    private static class DeleteMissionAsyncTask extends AsyncTask<RocketDetails, Void, Void> {
        private final RocketDao rocketDao;

        private DeleteMissionAsyncTask(RocketDao rocketDao) {
            this.rocketDao = rocketDao;
        }

        @Override
        protected Void doInBackground(RocketDetails... rocketDetails) {
            // below line is use to delete
            // our mission modal in dao.
            rocketDao.delete(rocketDetails[0]);
            return null;
        }
    }

    // we are creating a async task method to delete all mission data.
    private static class DeleteAllMissionsAsyncTask extends AsyncTask<Void, Void, Void> {
        private final RocketDao rocketDao;

        private DeleteAllMissionsAsyncTask(RocketDao rocketDao) {
            this.rocketDao = rocketDao;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            // on below line calling method
            // to delete all mission data.
            rocketDao.deleteAllCourses();
            return null;
        }
    }
}
