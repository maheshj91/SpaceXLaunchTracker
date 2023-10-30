package com.spacex.tracker.view.dao.repo;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.spacex.tracker.view.dao.db.TrackerDatabase;
import com.spacex.tracker.view.dao.interfaces.LaunchDao;
import com.spacex.tracker.view.model.Launches;

import java.util.List;

@SuppressWarnings("deprecation")
public class LaunchesRepository {

    // below line is the create a variable
    // for dao and list for all launches.
    private final LaunchDao launchDao;
    private final LiveData<List<Launches>> allLaunches;

    // creating a constructor for our variables
    // and passing the variables to it.
    public LaunchesRepository(Application application) {
        TrackerDatabase database = TrackerDatabase.getInstance(application);
        launchDao = database.launchDao();
        allLaunches = launchDao.getAllLaunches();
    }

    // creating a method to insert the data to our database.
    public void insert(Launches launches) {
        new InsertLaunchAsyncTask(launchDao).execute(launches);
    }

    // creating a method to update data in database.
    public void update(Launches launches) {
        new UpdateLaunchAsyncTask(launchDao).execute(launches);
    }

    // creating a method to delete the data in our database.
    public void delete(Launches launches) {
        new DeleteLaunchAsyncTask(launchDao).execute(launches);
    }

    // below is the method to delete all the launches.
    public void deleteAllLaunches() {
        new DeleteAllLaunchesAsyncTask(launchDao).execute();
    }

    // below method is to read all the launches.
    public LiveData<List<Launches>> getAllLaunches() {
        return allLaunches;
    }

    // we are creating a async task method to insert new launch data.
    private static class InsertLaunchAsyncTask extends AsyncTask<Launches, Void, Void> {
        private final LaunchDao launchDao;

        private InsertLaunchAsyncTask(LaunchDao launchDao) {
            this.launchDao = launchDao;
        }

        @Override
        protected Void doInBackground(Launches... launches) {
            // below line is use to insert our modal in dao.
            launchDao.insert(launches[0]);
            return null;
        }
    }

    // we are creating a async task method to update our launch data.

    private static class UpdateLaunchAsyncTask extends AsyncTask<Launches, Void, Void> {
        private final LaunchDao launchDao;

        private UpdateLaunchAsyncTask(LaunchDao launchDao) {
            this.launchDao = launchDao;
        }

        @Override
        protected Void doInBackground(Launches... launches) {
            // below line is use to update
            // our modal in dao.
            launchDao.update(launches[0]);
            return null;
        }
    }

    // we are creating a async task method to delete launch data.
    private static class DeleteLaunchAsyncTask extends AsyncTask<Launches, Void, Void> {
        private final LaunchDao launchDao;

        private DeleteLaunchAsyncTask(LaunchDao launchDao) {
            this.launchDao = launchDao;
        }

        @Override
        protected Void doInBackground(Launches... launches) {
            // below line is use to delete
            // our launch modal in dao.
            launchDao.delete(launches[0]);
            return null;
        }
    }

    // we are creating a async task method to delete all launch data.
    private static class DeleteAllLaunchesAsyncTask extends AsyncTask<Void, Void, Void> {
        private final LaunchDao launchDao;

        private DeleteAllLaunchesAsyncTask(LaunchDao launchDao) {
            this.launchDao = launchDao;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            // on below line calling method
            // to delete all launch data.
            launchDao.deleteAllLaunches();
            return null;
        }
    }
}
