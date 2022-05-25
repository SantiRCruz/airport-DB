package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class FlyEntity(
    val id_fly: Int = 0,
    val airplane_id: Int = 0,
    val users_id: Int = 0
)
