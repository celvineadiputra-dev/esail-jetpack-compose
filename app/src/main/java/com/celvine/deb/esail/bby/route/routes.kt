package com.celvine.deb.esail.bby.route

sealed class Routes(val routes: String) {
    object Login : Routes("login")
    object Register : Routes("register")
    object Dashboard : Routes("dashboard")
    object Search : Routes("search")
}