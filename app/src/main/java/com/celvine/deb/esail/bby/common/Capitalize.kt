package com.celvine.deb.esail.bby.common

fun Capitalize(str: String): String {
    return str.trim().split("\\s+".toRegex())
        .map { it.capitalize() }.joinToString(" ")
}