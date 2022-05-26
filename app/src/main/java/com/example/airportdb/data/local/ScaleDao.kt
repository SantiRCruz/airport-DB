package com.example.airportdb.data.local

import androidx.room.Dao
import androidx.room.Query
import com.example.airportdb.data.models.ScalesEntity


@Dao
interface ScaleDao {

    // list the sacles of a program file in order
    @Query("SELECT * FROM scalesentity WHERE program_flights_id = :id_program_flight ORDER BY id_scale DESC ")
    suspend fun getScalesByProgram(id_program_flight:Int):List<ScalesEntity>


    // list flights that come out or arrive form x airport
    @Query("SELECT * FROM scalesentity s " +
            "INNER JOIN typescalesentity t on s.type_scale_id = t.id_type_scale " +
            "INNER JOIN programfliesentity p on  s.program_flights_id = p.id_program_flights " +
            "INNER JOIN flyentity f on  p.fly_id = f.id_fly " +
            "WHERE t.city_id =:id_city")
    suspend fun getFlyFromCity(id_city:Int):List<ScalesEntity>

    //obtain the total scales by a program flight
    @Query("SELECT COUNT(*) FROM scalesentity s WHERE s.program_flights_id =:id_program_flight")
    suspend fun getCountScaleByProgramFlight(id_program_flight:Int):List<ScalesEntity>

}