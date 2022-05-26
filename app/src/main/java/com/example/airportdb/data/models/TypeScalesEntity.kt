package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class TypeScalesEntity(
    val id_type_scale:Int = 0,
    val city_id:Int = 0,
    val type:String = ""
)
