package com.celvine.deb.esail.bby

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.celvine.deb.esail.bby.route.Routes
import com.celvine.deb.esail.bby.presentation.screen.DashboardScreen
import com.celvine.deb.esail.bby.presentation.screen.LoginScreen
import com.celvine.deb.esail.bby.presentation.screen.RegisterScreen
import com.celvine.deb.esail.bby.presentation.screen.SearchScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartSail(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold { paddingValues ->
        val padding = paddingValues
        NavHost(navController = navController, startDestination = Routes.Login.routes) {
            composable(Routes.Login.routes) {
                LoginScreen(navController = navController)
            }
            composable(Routes.Register.routes) {
                RegisterScreen(navController = navController)
            }
            composable(Routes.Dashboard.routes) {
                DashboardScreen(navController = navController)
            }
            composable(Routes.Search.routes) {
                SearchScreen(navController = navController)
            }
        }
    }
}

@Preview
@Composable
fun StartSailPreview() {
    StartSail()
}