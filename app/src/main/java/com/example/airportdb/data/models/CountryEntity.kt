package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class CountryEntity(
    val id_country:Int =0,
    val name:String =""
)
