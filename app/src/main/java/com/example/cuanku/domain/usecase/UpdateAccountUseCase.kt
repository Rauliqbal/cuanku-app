package com.example.cuanku.domain.usecase

import com.example.cuanku.data.local.entity.AccountEntity
import com.example.cuanku.data.repository.AccountRepository

class UpdateAccountUseCase(
  private val repository: AccountRepository
) {

  suspend operator fun invoke(
    account: AccountEntity
  ) {
    repository.updateAccount(account)
  }
}