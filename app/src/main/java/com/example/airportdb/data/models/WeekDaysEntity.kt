package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class WeekDaysEntity(
    val id_week_day:Int = 0,
    val day:Int = 0,
)
