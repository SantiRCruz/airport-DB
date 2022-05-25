package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class TypeUserEntity(
    val id_type:Int=0,
    val type:String="",
)
