package com.example.cuanku.data.local.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.cuanku.data.local.entity.CategoryEntity
import kotlinx.coroutines.flow.Flow

interface CategoryDao {

  @Query("SELECT * FROM category")
  fun getAll(): Flow<List<CategoryEntity>>

  @Insert
  suspend fun insert(category: CategoryEntity)

  @Delete
  suspend fun delete(category: CategoryEntity)
}