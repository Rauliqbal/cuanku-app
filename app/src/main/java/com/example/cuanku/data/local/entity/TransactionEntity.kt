package com.example.cuanku.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class TransactionEntity(
  @PrimaryKey(autoGenerate = true)
  val id:Long = 0,

  val accountId:Long = 0,

  val categoryId:Long=0,

  val type:String,

  val amount:Double,

  val note:String,

  val date:String,

  val createdAt: Date,

  val updatedAt: Date
 )
