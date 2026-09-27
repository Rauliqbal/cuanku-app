package com.example.cuanku.data.local.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.cuanku.data.local.entity.TransactionEntity
import kotlinx.coroutines.flow.Flow

interface TransactionDao {

  @Query("SELECT * FROM transactions")
  suspend fun getAll(): Flow<List<TransactionEntity>>

  @Insert
  suspend fun insert(transaction: TransactionDao)

  @Delete
  suspend fun delete(transaction: TransactionDao)

}