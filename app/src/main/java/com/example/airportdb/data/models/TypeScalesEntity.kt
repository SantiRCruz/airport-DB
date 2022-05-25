package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class TypeScalesEntity(
    val id_technic_scale:Int = 0,
    val type:String = ""
)
