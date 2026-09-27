package com.example.cuanku.data.repository

import com.example.cuanku.data.local.dao.AccountDao
import com.example.cuanku.data.local.entity.AccountEntity
import com.example.cuanku.domain.repository.AccountRepository
import kotlinx.coroutines.flow.Flow

class AccountRepository(
  private val accountDao: AccountDao
) {

  fun getAllAccounts(): Flow<List<AccountEntity>> {
    return accountDao.getAllAccounts()
  }

  suspend fun getAccountById(id: Long): AccountEntity? {
    return accountDao.getAccountById(id)
  }

  suspend fun insertAccount(account: AccountEntity): Long {
    return accountDao.insertAccount(account)
  }

  suspend fun updateAccount(account: AccountEntity) {
    accountDao.updateAccount(account)
  }

  suspend fun deleteAccount(account: AccountEntity) {
    accountDao.deleteAccount(account)
  }
}