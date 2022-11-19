package com.celvine.deb.esail.bby.route

sealed class Routes(val routes: String) {
    object Login : Routes("login")
}