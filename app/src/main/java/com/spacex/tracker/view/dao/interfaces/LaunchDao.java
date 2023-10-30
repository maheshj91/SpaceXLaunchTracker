package com.spacex.tracker.view.dao.interfaces;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Query;
import androidx.room.Update;
import androidx.room.Upsert;

import com.spacex.tracker.view.model.Launches;

import java.util.List;

@androidx.room.Dao
public interface LaunchDao {

    // below method is use to
    // add data to database.
    @Upsert
    void insert(Launches launches);

    // below method is use to update
    // the data in our database.
    @Update
    void update(Launches launches);

    // below line is use to delete a
    // specific Launches in our database.
    @Delete
    void delete(Launches launches);

    // on below line we are making query to
    // delete all Launches from our database.
    @Query("DELETE FROM launches")
    void deleteAllLaunches();

    // below line is to read all the Launches from our database.
    // in this we are ordering our Launches in ascending order
    // with our flight number.
    @Query("SELECT * FROM launches ORDER BY flight_number ASC")
    LiveData<List<Launches>> getAllLaunches();
}
