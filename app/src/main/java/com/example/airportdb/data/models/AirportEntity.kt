package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class AirportEntity(
    val id_airport:Int=0,
    val city_id:Int=0,
    val name:String="",
    val code:String="",
)
