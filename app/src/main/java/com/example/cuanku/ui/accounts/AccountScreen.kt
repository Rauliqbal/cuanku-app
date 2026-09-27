package com.example.cuanku.ui.accounts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cuanku.data.local.entity.AccountEntity

@Composable
fun AccountScreen(viewModel: AccountViewModel) {

  val accounts by viewModel.accounts.collectAsState()

  Column(
    modifier = Modifier
      .fillMaxSize()
      .padding(16.dp)
  ) {
    Text(
      text = "Accounts",
      style = MaterialTheme.typography.headlineMedium
    )

    LazyColumn(
      modifier = Modifier
      .fillMaxSize()
      .padding(6.dp),
      verticalArrangement = Arrangement.spacedBy(8.dp)
      ) {
      items(
        items = accounts,
        key = { it.id }
      ) { account ->

        AccountItem(
          account = account,
          onDelete = {
            viewModel.deleteAccount(account)
          }
        )
      }
    }

    Button(
      onClick = {
        viewModel.addAccount(
          name = "BCA",
          type = "BANK",
          balance = 5_000_000.0
        )
      }
    ) {
      Text("Add BCA")
    }
  }
}

@Composable
fun AccountItem(
  account: AccountEntity,
  onDelete: () -> Unit
) {

  Card {

    Column(
      modifier = Modifier.padding(16.dp)
    ) {

      Text(
        text = account.name,
        style = MaterialTheme.typography.titleMedium
      )

      Text(
        text = account.type,
        style = MaterialTheme.typography.bodyMedium
      )

      Text(
        text = "Rp ${account.balance}",
        style = MaterialTheme.typography.titleLarge
      )

      Button(
        onClick = onDelete
      ) {
        Text("Delete")
      }
    }
  }
}