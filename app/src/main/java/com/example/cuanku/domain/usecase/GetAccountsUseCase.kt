package com.example.cuanku.domain.usecase

import com.example.cuanku.data.local.entity.AccountEntity
import com.example.cuanku.data.repository.AccountRepository
import kotlinx.coroutines.flow.Flow

class GetAccountsUseCase(
  private val repository: AccountRepository
) {

  operator fun invoke(): Flow<List<AccountEntity>> {
    return repository.getAllAccounts()
  }
}