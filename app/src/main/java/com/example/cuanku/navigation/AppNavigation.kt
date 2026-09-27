package com.example.cuanku.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cuanku.presentation.dashboard.DashboardScreen

@Composable
fun AppNavigation() {
  val navController = rememberNavController()

  NavHost(
    navController = navController,
    startDestination = "dashboard"
  ) {
    composable("dashboard") {
      DashboardScreen()
    }
    composable("trasanctions") {

    }
  }
}