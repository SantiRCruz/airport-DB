package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class HistoryUsersEntity(
    val id_history:Int = 0,
    val fly_id:Int = 0,
)
