package com.example.cuanku.data.local.database

import android.content.Context
import androidx.room.Room

class DatabaseProvider {
  object DatabaseProvider {

    @Volatile
    private var INSTANCE: AppDatabase? = null

    fun getDatabase(context: Context): AppDatabase {
      return INSTANCE ?: synchronized(this) {
        INSTANCE ?: Room.databaseBuilder(
          context.applicationContext,
          AppDatabase::class.java,
          "finance_app.db"
        ).build().also {
          INSTANCE = it
        }
      }
    }
  }
}