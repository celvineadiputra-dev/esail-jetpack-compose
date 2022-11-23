package com.celvine.deb.esail.bby.data

import com.celvine.deb.esail.bby.models.CourseModel

object CourseData {
    val data = listOf<CourseModel>(
        CourseModel(
            id = 1,
            title = "UI Styleguide With Figma",
            sortDesc = "Saatnya mendesain UI dengan lebih mudah cepat dan mudah dengan menggunakan Jetpack Compose, cara modern untuk membuat layout di Android.",
            desc = "",
            isFree = true,
            banner = "https://buildwithangga.com/storage/assets/thumbnails/UI%20Styleguide%20With%20Figma%201.jpeg",
            rating = "4.9 (409)",
            mentor = "Debby",
            isPopular = true,
            category = "Design"
        ),
        CourseModel(
            id = 2,
            title = "Belajar Membuat Aplikasi Android dengan Jetpack Compose 1",
            sortDesc = "Saatnya mendesain UI dengan lebih mudah cepat dan mudah",
            desc = "",
            isFree = false,
            price = "139K",
            banner = "https://developer.android.com/static/codelabs/jetpack-compose-animation/img/5bb2e531a22c7de0.png?hl=id",
            rating = "4.9 (409)",
            mentor = "Debby",
            category = "Development",
            isFlashSale = true
        ),
        CourseModel(
            id = 3,
            title = "Full-Stack JavaScript Developer 2021: Website Top Up Voucher Game",
            sortDesc = "MERN Stack adalah pengembangan website dari Front-End sampai Back-End dengan memakai satu bahasa pemrograman yaitu Javascript.",
            desc = "",
            isFree = false,
            price = "349K",
            banner = "https://buildwithangga.com/storage/assets/thumbnails/thumbnail%20kelas%20premium%20Full-Stack%20JavaScript%20Developer%202021%20buildwith%20angga%202%20(1).png",
            rating = "4.9 (409)",
            mentor = "Angga",
            category = "Development",
            isPopular = true,
            isFlashSale = true
        )
    )
}