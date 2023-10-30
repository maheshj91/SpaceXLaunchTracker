package com.spacex.tracker.view.dao.interfaces;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Query;
import androidx.room.Update;
import androidx.room.Upsert;

import com.spacex.tracker.view.model.RocketDetails;

import java.util.List;

@Dao
public interface RocketDao {

    // below method is use to
    // add data to database.
    @Upsert
    void insert(RocketDetails rocketDetails);

    // below method is use to update
    // the data in our database.
    @Update
    void update(RocketDetails rocketDetails);

    // below line is use to delete a
    // specific rocket detail in our database.
    @Delete
    void delete(RocketDetails rocketDetails);

    // on below line we are making query to
    // delete all rockets from our database.
    @Query("DELETE FROM rocket")
    void deleteAllCourses();

    // below line is to read all the rocket from our database.
    // in this we are ordering our rocket in ascending order
    // with our rocket name.
    @Query("SELECT * FROM rocket ORDER BY rocket_name ASC")
    LiveData<List<RocketDetails>> getAllRocketDetails();

    // below line is to read rocket detail based on rocket id from our database.
    @Query("SELECT * FROM rocket where rocket_id= :rocketId")
    LiveData<RocketDetails> getRocketDetailById(String rocketId);
}
