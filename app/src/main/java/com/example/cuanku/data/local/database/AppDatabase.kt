package com.example.cuanku.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cuanku.data.local.dao.AccountDao
import com.example.cuanku.data.local.dao.CategoryDao
import com.example.cuanku.data.local.dao.TransactionDao
import com.example.cuanku.data.local.entity.AccountEntity

@Database(
  entities = [
    AccountEntity::class
  ],
  version = 1,
  exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {

  abstract fun accountDao(): AccountDao
}