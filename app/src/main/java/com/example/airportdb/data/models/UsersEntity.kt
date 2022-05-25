package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class UsersEntity(
    val id_user:Int=0,
    val name:String="",
)
