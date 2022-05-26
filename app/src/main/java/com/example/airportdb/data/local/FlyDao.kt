package com.example.airportdb.data.local

import androidx.room.Dao
import androidx.room.Query
import com.example.airportdb.data.models.FlyEntity

@Dao
interface FlyDao {
    //list the number of seating on a fly
    @Query("SELECT am.capacity FROM flyentity f " +
            "INNER JOIN airplaneentity ap on f.airplane_id = ap.id_airplane " +
            "INNER JOIN airplanemodelentity am on ap.airplane_model_id = am.id_model " +
            "WHERE f.id_fly = :id_fly ")
    suspend fun getSeatsByFly(id_fly:Int):List<FlyEntity>

}