package com.example.airportdb.data.local

import androidx.room.Dao
import androidx.room.Query
import com.example.airportdb.data.models.FlyEntity

@Dao
interface UserDao {

    // list flight that a user do
    @Query("SELECT * FROM flyentity f " +
            "INNER JOIN usersentity u on f.users_id = u.id_user " +
            "WHERE users_id = :id_user ")
    suspend fun getFlyByUser(id_user:Int):List<FlyEntity>

    //list flight where a user is not in it
    @Query("SELECT * FROM flyentity f " +
            "INNER JOIN usersentity u on f.users_id = u.id_user " +
            "WHERE f.users_id NOT IN (:id_user)  ")
    suspend fun getNotFlightsByUses(id_user:Int):List<FlyEntity>
}