package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class ProvinceEntity(
    val id_province:Int = 0,
    val country_id:Int = 0,
    val name:String = ""
)
