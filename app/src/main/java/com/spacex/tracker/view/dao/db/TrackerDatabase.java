package com.spacex.tracker.view.dao.db;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.spacex.tracker.view.dao.converter.Converters;
import com.spacex.tracker.view.dao.interfaces.LaunchDao;
import com.spacex.tracker.view.dao.interfaces.MissionDao;
import com.spacex.tracker.view.dao.interfaces.RocketDao;
import com.spacex.tracker.view.model.Launches;
import com.spacex.tracker.view.model.Missions;
import com.spacex.tracker.view.model.RocketDetails;

// adding annotation for our database entities and db version.
@SuppressWarnings("deprecation")
@Database(entities = {Launches.class, Missions.class, RocketDetails.class}, version = 1)
@TypeConverters(Converters.class)
public abstract class TrackerDatabase extends RoomDatabase {

    // below line is to create instance
    // for our database class.
    private static TrackerDatabase trackerInstance;

    // below line is to create
    // abstract variable for dao.
    public abstract LaunchDao launchDao();
    public abstract MissionDao missionDao();
    public abstract RocketDao rocketDao();

    // on below line we are getting instance for our database.
    public static synchronized TrackerDatabase getInstance(Context context) {
        // below line is to check if
        // the instance is null or not.
        if (trackerInstance == null) {
            // if the instance is null we
            // are creating a new instance
            trackerInstance =
                    // for creating a instance for our database
                    // we are creating a database builder and passing
                    // our database class with our database name.
                    Room.databaseBuilder(context.getApplicationContext(),
                                    TrackerDatabase.class, "course_database")
                            // below line is use to add fall back to
                            // destructive migration to our database.
                            .fallbackToDestructiveMigration()
                            // below line is to add callback
                            // to our database.
                            .addCallback(roomCallback)
                            // below line is to
                            // build our database.
                            .build();
        }
        // after creating an instance
        // we are returning our instance
        return trackerInstance;
    }

    // below line is to create a callback for our room database.
    private static final RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            // this method is called when database is created
            // and below line is to populate our data.
            new PopulateDbAsyncTask(trackerInstance).execute();
        }
    };

    // we are creating an async task class to perform task in background.
    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        PopulateDbAsyncTask(TrackerDatabase instance) {
            LaunchDao launchDao = instance.launchDao();
            MissionDao missionDao = instance.missionDao();
            RocketDao rocketDao = instance.rocketDao();
        }
        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }
}
