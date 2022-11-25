package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.celvine.deb.esail.bby.route.NavigationItem
import com.celvine.deb.esail.bby.common.theme.DodgerBlue
import com.celvine.deb.esail.bby.common.theme.DodgerBlueShade
import com.celvine.deb.esail.bby.common.theme.IceBlue
import com.celvine.deb.esail.bby.common.theme.White
import com.celvine.deb.esail.bby.route.Routes

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Sail,
        NavigationItem.Wishlist,
        NavigationItem.Profile,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    NavigationBar(containerColor = White, contentColor = DodgerBlue) {
        items.forEach { item ->
            NavigationBarItem(
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        modifier = Modifier
                            .width(18.dp)
                            .height(20.dp),
                        painter = painterResource(id = item.icon),
                        contentDescription = item.title
                    )
                },
                label = null,
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = DodgerBlueShade,
                    selectedIconColor = White,
                    unselectedIconColor = IceBlue
                )
            )
        }
    }
}