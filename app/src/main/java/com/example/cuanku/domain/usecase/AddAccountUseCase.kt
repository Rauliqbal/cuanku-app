package com.example.cuanku.domain.usecase

import com.example.cuanku.data.local.entity.AccountEntity
import com.example.cuanku.data.repository.AccountRepository

class AddAccountUseCase(
  private val repository: AccountRepository
) {

  suspend operator fun invoke(
    account: AccountEntity
  ): Long {
    return repository.insertAccount(account)
  }
}