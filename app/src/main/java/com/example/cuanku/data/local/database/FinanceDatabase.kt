package com.example.cuanku.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cuanku.data.local.dao.AccountDao
import com.example.cuanku.data.local.entity.AccountEntity
import com.example.cuanku.data.local.entity.CategoryEntity
import com.example.cuanku.data.local.entity.TransactionEntity

@Database(entities = [
  AccountEntity::class,
  CategoryEntity::class,
  TransactionEntity::class
], version = 1)
abstract class FinanceDatabase : RoomDatabase() {

  abstract fun accountDao(): AccountDao
}