package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class SeatingEntity(
    val id_seating :Int = 0,
    val nameSeat:String = "",
    val busy:Boolean = false
)
