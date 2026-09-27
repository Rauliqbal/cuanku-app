package com.example.cuanku.domain.repository

import com.example.cuanku.data.local.entity.AccountEntity
import kotlinx.coroutines.flow.Flow

interface AccountRepository {
  fun getAllAccounts(): Flow<List<AccountEntity>>

  fun getAccountById(id: Long): Flow<AccountEntity?>

  suspend fun insertAccount(account: AccountEntity)

  suspend fun updateAccount(account: AccountEntity)

  suspend fun deleteAccount(account: AccountEntity)
}