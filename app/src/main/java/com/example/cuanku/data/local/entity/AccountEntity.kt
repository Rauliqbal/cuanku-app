package com.example.cuanku.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity()
data class AccountEntity(
  @PrimaryKey(autoGenerate = true)
  val id: Long = 0,

  val name:String,

  val type:String,

  val currency:String,

  val initialBalance:String
)
