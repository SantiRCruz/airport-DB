package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class CityEntity(
    val id_city:Int = 0,
    val province_id:Int = 0,
    val name:String = ""
)
