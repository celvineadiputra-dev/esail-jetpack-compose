package com.celvine.deb.esail.bby.common

import kotlin.math.abs

fun FormatPrice(price: Int): String {
    var numberString: String = ""
    numberString = if (abs(price / 1000000) > 1) {
        (price / 1000000).toString() + "m"
    } else if (abs(price / 1000) > 1) {
        (price / 1000).toString() + "k"
    } else {
        price.toString()
    }

    return numberString
}