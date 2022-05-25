package com.example.airportdb.data.local

import androidx.room.Dao
import androidx.room.Query
import com.example.airportdb.data.models.ScalesEntity


@Dao
interface ScaleDao {

    @Query("SELECT * FROM scalesentity WHERE program_file_id = :id_program_file ")
    suspend fun getScalesByProgram(id_program_file:Int):List<ScalesEntity>

}