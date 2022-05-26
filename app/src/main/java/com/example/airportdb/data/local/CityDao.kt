package com.example.airportdb.data.local

import androidx.room.Dao
import androidx.room.Query
import com.example.airportdb.data.models.CityEntity

@Dao
interface CityDao {
    @Query("SELECT * FROM cityentity WHERE id_city NOT IN (SELECT * FROM airportentity a INNER JOIN cityentity c on a.city_id = c.id_city)")
    suspend fun getCitiesWithOutAirport():List<CityEntity>
}