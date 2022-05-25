package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class ArriveEntity(
    val id_arrive:Int= 0,
    val fly_id:Int=0,
    val arrived:Boolean=false
)
