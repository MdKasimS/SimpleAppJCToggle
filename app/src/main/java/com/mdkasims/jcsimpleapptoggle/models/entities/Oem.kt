package com.mdkasims.jcsimpleapptoggle.models.entities
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "oem_data")
data class Oem(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,


)

