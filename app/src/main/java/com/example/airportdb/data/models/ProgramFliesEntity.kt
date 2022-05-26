package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class ProgramFliesEntity(
    val id_program_flights:Int =0,
    val fly_id:Int =0,
    val week_day_id:Int =0,
    val numberFly:String ="",
)
