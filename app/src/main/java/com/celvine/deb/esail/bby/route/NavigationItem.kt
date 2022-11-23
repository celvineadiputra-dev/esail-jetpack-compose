package com.celvine.deb.esail.bby.route

import com.celvine.deb.esail.bby.R

sealed class NavigationItem(var route : String, var icon: Int, var title : String) {
    object Home : NavigationItem(Routes.Dashboard.routes, R.drawable.house_icon, "Home")
    object Sail : NavigationItem(Routes.Login.routes , R.drawable.sailboat_icon, "Sail")
    object Wishlist : NavigationItem("Wishlist", R.drawable.seedling_icon, "Wishlist")
    object Profile : NavigationItem("Profile", R.drawable.captain, "Profile")
}
