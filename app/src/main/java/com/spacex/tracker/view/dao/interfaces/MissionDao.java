package com.spacex.tracker.view.dao.interfaces;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Query;
import androidx.room.Update;
import androidx.room.Upsert;

import com.spacex.tracker.view.model.Missions;

import java.util.List;

@Dao
public interface MissionDao {

    // below method is use to
    // add data to database.
    @Upsert
    void insert(Missions missions);

    // below method is use to update
    // the data in our database.
    @Update
    void update(Missions missions);

    // below line is use to delete a
    // specific mission in our database.
    @Delete
    void delete(Missions missions);

    // on below line we are making query to
    // delete all missions from our database.
    @Query("DELETE FROM missions")
    void deleteAllCourses();

    // below line is to read all the missions from our database.
    // in this we are ordering our missions in ascending order
    // with our mission name.
    @Query("SELECT * FROM missions ORDER BY mission_name ASC")
    LiveData<List<Missions>> getAllMissions();

    // below line is to read mission based on mission id from our database.
    @Query("SELECT * FROM missions where mission_id= :missionId")
    LiveData<Missions> getMissionById(String missionId);
}
