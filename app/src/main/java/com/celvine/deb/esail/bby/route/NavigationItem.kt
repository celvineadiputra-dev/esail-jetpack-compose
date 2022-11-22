package com.celvine.deb.esail.bby.route

import com.celvine.deb.esail.bby.R

sealed class NavigationItem(var route : String, var icon: Int, var title : String) {
    object Home : NavigationItem(Routes.Dashboard.routes, R.drawable.bell_icon, "Home")
    object Mentor : NavigationItem(Routes.Login.routes, R.drawable.bell_icon, "Mentor")
    object Course : NavigationItem("Course", R.drawable.bell_icon, "My Course")
    object Profile : NavigationItem("Profile", R.drawable.bell_icon, "Profile")
}
