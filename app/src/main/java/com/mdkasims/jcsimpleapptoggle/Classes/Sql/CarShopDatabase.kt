package com.mdkasims.jcsimpleapptoggle.Classes.Sql

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mdkasims.jcsimpleapptoggle.models.daos.OemDao
import com.mdkasims.jcsimpleapptoggle.models.entities.Oem

@Database(entities = [Oem::class], version = 1)
abstract class CarShopDatabase : RoomDatabase() {
    abstract fun oemDao(): OemDao
}