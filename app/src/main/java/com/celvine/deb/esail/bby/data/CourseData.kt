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
            rating = "4.5 (1027)",
            mentor = "Celvine",
            isPopular = true,
            category = "Design"
        ),
        CourseModel(
            id = 2,
            title = "Belajar Membuat Aplikasi Android dengan Jetpack Compose",
            sortDesc = "Saatnya mendesain UI dengan lebih mudah cepat dan mudah",
            desc = "",
            isFree = false,
            price = "139K",
            banner = "https://developer.android.com/static/codelabs/jetpack-compose-animation/img/5bb2e531a22c7de0.png?hl=id",
            rating = "4.9 (409)",
            mentor = "Debb",
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
            rating = "4.9 (1394)",
            mentor = "Angga",
            category = "Development",
            isPopular = true,
            isFlashSale = true
        ),
        CourseModel(
            id = 4,
            title = "UI/UX Design dengan figma",
            sortDesc = "MERN Stack adalah pengembangan website dari Front-End sampai Back-End dengan memakai satu bahasa pemrograman yaitu Javascript.",
            desc = "",
            isFree = false,
            price = "452K",
            banner = "https://celvine.sirv.com/esail/original-c4e13a3f961e127594d8cd436cd03083.webp",
            rating = "4.8 (1001)",
            mentor = "Anvarov Bekzod",
            category = "Design UI/UX",
            isPopular = true,
            isFlashSale = false
        ),
        CourseModel(
            id = 5,
            title = "Learn Flutter UI/UX: Fashion using GetX",
            sortDesc = "MERN Stack adalah pengembangan website dari Front-End sampai Back-End dengan memakai satu bahasa pemrograman yaitu Javascript.",
            desc = "",
            isFree = false,
            price = "339",
            banner = "https://celvine.sirv.com/esail/S1.png?w=4318&scale.option=fill&format=webp&q=76",
            rating = "4.8 (1023)",
            mentor = "Celvine & Deb",
            category = "Development",
            isPopular = true,
            isFlashSale = true
        )
    )
}