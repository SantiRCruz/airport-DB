package com.example.airportdb.data.models

import androidx.room.Entity

@Entity
data class ScalesEntity(
    val id_scale:Int = 0,
    val program_file_id:Int = 0,
    val technic_scale_id:Int = 0,
)
