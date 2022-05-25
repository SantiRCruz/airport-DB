package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class AirplaneModelEntity(
    val id_model:Int=0,
    val name:String="",
    val code:Int=0,
    val capacity:String="",
)
