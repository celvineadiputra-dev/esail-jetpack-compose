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
import com.celvine.deb.esail.bby.presentation.screen.*
import com.celvine.deb.esail.bby.route.Routes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartSail(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()

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
                DashboardScreen()
            }
        }
    }
}

@Preview
@Composable
fun StartSailPreview() {
    StartSail()
}