package com.example.cuanku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.room.Room
import com.example.cuanku.data.local.database.FinanceDatabase
import com.example.cuanku.data.repository.AccountRepository
import com.example.cuanku.ui.accounts.AccountScreen
import com.example.cuanku.ui.accounts.AccountViewModel
import com.example.cuanku.ui.accounts.AccountViewModelFactory
import com.example.cuanku.ui.theme.CuankuAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val database = Room.databaseBuilder(
            applicationContext,
            FinanceDatabase::class.java,
            "finance_database"
        ).build()

        val repository = AccountRepository(
            database.accountDao()
        )

        val factory = AccountViewModelFactory(
            repository
        )

        setContent {

            val viewModel: AccountViewModel = viewModel(factory = factory)

            AccountScreen(
                viewModel = viewModel
            )



//            CuankuAppTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                    DashboardScreen()
//                }
//            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuankuAppTheme {
        Greeting("Android")
    }
}