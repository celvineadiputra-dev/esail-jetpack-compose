package com.celvine.deb.esail.bby.data

import com.celvine.deb.esail.bby.models.CourseModel

object CourseData {
    val data = listOf<CourseModel>(
        CourseModel(
            id = 1,
            title = "Android dengan Jetpack Compose",
            sortDesc = "Saatnya mendesain UI dengan lebih mudah cepat dan mudah dengan menggunakan Jetpack Compose, cara modern untuk membuat layout di Android.",
            desc = "",
            isFree = true,
            banner = "https://developer.android.com/static/codelabs/jetpack-compose-animation/img/5bb2e531a22c7de0.png?hl=id",
            rating = "4.9 (409)",
        ),
        CourseModel(
            id = 2,
            title = "Belajar Membuat Aplikasi Android dengan Jetpack Compose 1",
            sortDesc = "Saatnya mendesain UI dengan lebih mudah cepat dan mudah",
            desc = "",
            isFree = false,
            price = "139K",
            banner = "https://developer.android.com/static/codelabs/jetpack-compose-animation/img/5bb2e531a22c7de0.png?hl=id",
            rating = "4.9 (409)"
        )
    )
}