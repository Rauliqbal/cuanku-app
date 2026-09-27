package com.example.cuanku.ui.accounts

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cuanku.data.local.entity.AccountEntity
import com.example.cuanku.data.repository.AccountRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.WhileSubscribed
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class AccountViewModel(
  private val repository: AccountRepository
): ViewModel() {
  val accounts: StateFlow<List<AccountEntity>> = repository.getAllAccounts().stateIn(
    scope = viewModelScope,
    started = SharingStarted.WhileSubscribed(5_000),
    initialValue = emptyList()
  )

  fun addAccount(
    name:String,
    type:String,
    balance: Double
  ) {
    viewModelScope.launch {
      val account = AccountEntity(
        name = name,
        type = type,
        balance = balance
      )

      repository.insertAccount(account)
    }
  }

  fun updateAccount(account: AccountEntity) {
    viewModelScope.launch {
      repository.updateAccount(account)
    }
  }

  fun deleteAccount(account: AccountEntity) {
    viewModelScope.launch {
      repository.deleteAccount(account)
    }
  }

}