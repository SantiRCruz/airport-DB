package com.example.airportdb.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AirLineEntity(
    @PrimaryKey(autoGenerate = true)
    val id_airLine:Int=0,
    val name:String=""
)





