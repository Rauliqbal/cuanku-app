package com.example.cuanku.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "accounts")
data class AccountEntity(
  @PrimaryKey(autoGenerate = true)
  val id:Long = 0,

  val name:String,

  val type:String,

  val balance: Double = 0.0,

  val createdAt:Long = System.currentTimeMillis()

)