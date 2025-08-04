package com.mdkasims.jcsimpleapptoggle.Classes.Sql.DbContext

import android.content.Context
import androidx.room.Room
import com.mdkasims.jcsimpleapptoggle.Classes.Sql.CarShopDatabase

object DatabaseProvider {
    @Volatile
    private var INSTANCE: CarShopDatabase? = null

    fun getDatabase(context: Context): CarShopDatabase {
        return INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                CarShopDatabase::class.java,
                "car_shop_db"
            ).build()
            INSTANCE = instance
            instance
        }
    }
}