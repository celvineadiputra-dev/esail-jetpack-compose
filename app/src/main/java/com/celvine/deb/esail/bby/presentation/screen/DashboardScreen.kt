package com.celvine.deb.esail.bby.presentation.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.celvine.deb.esail.bby.route.Routes
import com.celvine.deb.esail.bby.ui.components.*
import com.celvine.deb.esail.bby.presentation.components.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavHostController = rememberNavController()) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(bottomBar = {
        if (currentRoute != Routes.Detail.routes) {
            BottomNavigationBar(navController)
        }
    }) { paddingValues ->
        val padding = paddingValues
        NavHost(navController = navController, startDestination = Routes.Home.routes) {
            composable(Routes.Home.routes) {
                HomeScreen(navController = navController)
            }
            composable(Routes.Search.routes) {
                SearchScreen(navController = navController)
            }
            composable(Routes.Profile.routes) {
                ProfileScreen(navController = navController)
            }
            composable(Routes.Detail.routes) {
                DetailScreen(navController = navController)
            }
        }
    }
}