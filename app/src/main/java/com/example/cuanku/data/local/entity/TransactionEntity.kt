package com.example.cuanku.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "transactions")
data class TransactionEntity(
  @PrimaryKey(autoGenerate = true)
  val id: Long = 0,

  val accountId: Long,

  val categoryId: Long,

  val type: String,

  val amount: Double,

  val note: String,

  val date: String,

  val createdAt: Long = System.currentTimeMillis()
)
