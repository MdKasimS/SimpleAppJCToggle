package com.mdkasims.jcsimpleapptoggle.models.daos
import androidx.room.*
import com.mdkasims.jcsimpleapptoggle.models.entities.Oem
import kotlinx.coroutines.flow.Flow

@Dao
interface OemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOEM(oem: Oem)

    @Query("SELECT * FROM oem_data")
    fun getAllOEMs(): Flow<List<Oem>>

    @Query("DELETE FROM oem_data")
    suspend fun clearOEMs()
}