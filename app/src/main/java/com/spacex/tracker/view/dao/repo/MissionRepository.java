package com.spacex.tracker.view.dao.repo;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.spacex.tracker.view.dao.db.TrackerDatabase;
import com.spacex.tracker.view.dao.interfaces.MissionDao;
import com.spacex.tracker.view.model.Missions;
import com.spacex.tracker.view.model.RocketDetails;

import java.util.List;

@SuppressWarnings("ALL")
public class MissionRepository {

    // below line is the create a variable
    // for dao and list for all launches.
    private final MissionDao missionDao;
    private final LiveData<List<Missions>> allMissions;

    // creating a constructor for our variables
    // and passing the variables to it.
    public MissionRepository(Application application) {
        TrackerDatabase database = TrackerDatabase.getInstance(application);
        missionDao = database.missionDao();
        allMissions = missionDao.getAllMissions();
    }

    // creating a method to insert the data to our database.
    public void insert(Missions missions) {
        new InsertMissionAsyncTask(missionDao).execute(missions);
    }

    // creating a method to update data in database.
    public void update(Missions missions) {
        new UpdateMissionAsyncTask(missionDao).execute(missions);
    }

    // creating a method to delete the data in our database.
    public void delete(Missions missions) {
        new DeleteMissionAsyncTask(missionDao).execute(missions);
    }

    // below is the method to delete all the missions.
    public void deleteAllCourses() {
        new DeleteAllMissionsAsyncTask(missionDao).execute();
    }

    // below method is to read all the missions.
    public LiveData<List<Missions>> getAllMissions() {
        return allMissions;
    }

    public LiveData<Missions> getMissionById(String missionId) {
        return missionDao.getMissionById(missionId);
    }

    // we are creating a async task method to insert new mission data.
    private static class InsertMissionAsyncTask extends AsyncTask<Missions, Void, Void> {
        private final MissionDao missionDao;

        private InsertMissionAsyncTask(MissionDao missionDao) {
            this.missionDao = missionDao;
        }

        @Override
        protected Void doInBackground(Missions... missions) {
            // below line is use to insert our modal in dao.
            missionDao.insert(missions[0]);
            return null;
        }
    }

    // we are creating a async task method to update our mission data.

    private static class UpdateMissionAsyncTask extends AsyncTask<Missions, Void, Void> {
        private final MissionDao missionDao;

        private UpdateMissionAsyncTask(MissionDao missionDao) {
            this.missionDao = missionDao;
        }

        @Override
        protected Void doInBackground(Missions... missions) {
            // below line is use to update
            // our modal in dao.
            missionDao.update(missions[0]);
            return null;
        }
    }

    // we are creating a async task method to delete mission data.
    private static class DeleteMissionAsyncTask extends AsyncTask<Missions, Void, Void> {
        private final MissionDao missionDao;

        private DeleteMissionAsyncTask(MissionDao missionDao) {
            this.missionDao = missionDao;
        }

        @Override
        protected Void doInBackground(Missions... missions) {
            // below line is use to delete
            // our mission modal in dao.
            missionDao.delete(missions[0]);
            return null;
        }
    }

    // we are creating a async task method to delete all mission data.
    private static class DeleteAllMissionsAsyncTask extends AsyncTask<Void, Void, Void> {
        private final MissionDao missionDao;

        private DeleteAllMissionsAsyncTask(MissionDao missionDao) {
            this.missionDao = missionDao;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            // on below line calling method
            // to delete all mission data.
            missionDao.deleteAllCourses();
            return null;
        }
    }
}
