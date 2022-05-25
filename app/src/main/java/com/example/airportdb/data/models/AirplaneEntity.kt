package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class AirplaneEntity(
    val id_airplane:Int = 0,
    val airplane_model_id:Int = 0,
    val air_line_id:Int = 0,
    val seating_id:Int = 0,
    val code:String = ""
)
