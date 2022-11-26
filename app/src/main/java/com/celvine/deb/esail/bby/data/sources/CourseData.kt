package com.celvine.deb.esail.bby.data.sources

import com.celvine.deb.esail.bby.data.model.CaptainModel
import com.celvine.deb.esail.bby.data.model.CourseModel

object CourseData {
    val data = listOf(
        CourseModel(
            id = 1,
            title = "Docker & Kubernetes: The Practical Guide",
            sortDesc = "Learn Docker, Docker Compose, Multi-Container Projects, Deployment and all about Kubernetes from the ground up!",
            desc = "Join this bestselling Docker & Kubernetes course and learn two of the most important development technologies from the ground up, in great detail!\n" +
                    "\n" +
                    "Docker & Kubernetes are amongst the most in-demand technologies and topics you can learn these days.\n" +
                    "\n" +
                    "Why?\n" +
                    "\n" +
                    "Because they significantly simplify the development and deployment process of both simple and complex software projects. Especially in web development (though not limited to that), Docker can really take you to the next level!",
            isFree = false,
            price = "129k",
            banner = "https://celvine.sirv.com/esail/bec1043d5a9ef77e413f3872a23f6958.webp",
            rating = "4.7 (14k)",
            Captain = CaptainModel(
                Name = "Maximilian Schwarzmüller",
                Job = "Online Education",
                Image = "https://img-c.udemycdn.com/user/200_H/31926668_94e7_6.jpg"
            ),
            category = "Development",
            isPopular = true,
            isFlashSale = true,
            totalTime = "10h 44m",
            totalVideo = 101
        ),
        CourseModel(
            id = 2,
            title = "Pemrograman Go-Lang : Pemula sampai Mahir",
            sortDesc = "Belajar pemrograman Go-Lang dari pemula sampai mahir disertai studi kasus. Materi akan selalu di-update secara berkala",
            desc = "Selamat datang di course Pemrograman Go-Lang dari Pemula sampai Mahir. Disini kita akan belajar Pemrograman Go-Lang dari tingkat dasar sampai tingkat mahir, disertai dengan studi kasus. Akan banyak materi yang akan dibahas di course ini seperti :\n" +
                    "\n" +
                    "Go-Lang Dasar, membahas dasar-dasar pemrograman Go-Lang, tipe data, variable, percabangan, perulangan, function dan lain-lain\n" +
                    "\n" +
                    "Go-Lang Modules, membahas cara membuat module atau project menggunakan Go Modules. Membuat project baru, membuat library, publish library ke repository, download library dan lain-lain\n" +
                    "\n" +
                    "Go-Lang Unit Test, membahas cara membuat unit test menggunakan Go-Lang, membuat unit test, membuat benchmark test, membuat mock, dan lain-lain\n" +
                    "\n" +
                    "Go-Lang Goroutines, membahas tentang concurrency dan parallel programming di Go-Lang. Membahas cara membuat goroutine, membuat lock, mutex, channel, dan lain-lain\n" +
                    "\n" +
                    "Go-Lang Database, memmabahas tentang database programming di Go-Lang menggunakan database MySQL. Cara membuat koneksi database, melakukan perintah SQL di Go-Lang, database transaction, repositorry pattern, dan lain-lain\n" +
                    "\n" +
                    "Go-Lang Web, membahas cara membuat Web menggunakan Go-Lang, membuat server web, membuat handler, membuat middleware, melakukan unit test web, dan lain-lain\n" +
                    "\n" +
                    "Go-Lang HttpRouter, membahas salah satu framework http handler yang populer di Go-Lang, cara menggunakan HttpRouter, dan bagaimana cara melakukan unit test nya\n" +
                    "\n" +
                    "dan lain-lain.\n" +
                    "\n" +
                    "Materi akan selalu di update secara berkala, dan ketika materi di update, harga course pun akan diupdate dengan harga baru. Jadi pastikan untuk secepatnya membeli course ini, makin cepat, makin murah harga pembelian course ini.",
            isFree = false,
            price = "340k",
            banner = "https://celvine.sirv.com/esail/RPA3.jpg",
            rating = "4.8 (2k)",
            Captain = CaptainModel(
                Name = "Eko Kurniawan Khannedy",
                Job = "Technical Architect and Content Creator",
                Image = "https://img-c.udemycdn.com/user/200_H/15481646_a97d_5.jpg"
            ),
            category = "Development",
            isPopular = true,
            isFlashSale = false,
            totalTime = "09h 22m",
            totalVideo = 210
        ),
        CourseModel(
            id = 3,
            title = "To-Do App with Jetpack Compose MVVM - Android Development",
            sortDesc = "Build a To-Do App using Modern Declarative UI Toolkit called Jetpack Compose to Accelerate your UI and App development.",
            desc = "Hello there and welcome to my course! In this course I'm going to teach you how to build your first Android App from scratch, using a popular UI toolkit called Jetpack Compose.\n" +
                    "\n" +
                    "I know that lots of you have been waiting for this moment, a moment when Jetpack Compose became stable! Now it's the right time to be an Android Developer! With a Jetpack Compose building Android Apps is going to be exciting, fun and  a lot simpler then before. We are not going to need XML anymore.\n" +
                    "\n" +
                    "Instead we are going to build our UI with a regular Kotlin file, using the full power of Kotlin programming language.  Also creating custom UI component has been easier. So you want to build a custom UI component, no problem, just start by adding a simple function annotated with @Composable annotation.\n" +
                    "\n" +
                    "And of course how would this course look like without a real project? Our To-Do application which we are going to develop in this course will have a Single Activity and Zero Fragments. Sounds impossible? Well it isn't. So better get used to it, because that will greatly simplify the process of developing Android apps.\n" +
                    "\n" +
                    "Now at the beginning of this course I'm going to introduce you with Jetpack Compose in general and with some of the most important concepts as well. You will learn everything about the Lifecycle of a single composable and how Compose Compiler is doing all the hard work for you behind the scenes.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "In this course we are going to use some of the most important Android Architecture components like:\n" +
                    "\n" +
                    "- ROOM Database: To save and read the data from a local database, plus we are going to write some custom SQL queries as well.\n" +
                    "\n" +
                    "- Compose Navigation: So we can navigate between our Screen Composables. And At the end of the course you will also learn how to add some beautiful transition animations as well.\n" +
                    "\n" +
                    "- ViewModel: Which will contain all the logic needed to work with our app.\n" +
                    "\n" +
                    "- Preference DataStore: To persist a simple key-value pairs.\n" +
                    "\n" +
                    "- And you'll learn about a popular dependency injection library called Dagger-Hilt. You will see how to inject a ViewModel with different  dependencies without needing to create a ViewModel Factory.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "By default our application will support Dark Mode as well, and you will learn how easy it is to have two different themes of your app with a Jetpack Compose. You will also learn how to build your own custom UI components.We will use some of the most popular material components along with a Scaffold, which is an amazing composable function that uses SLOT API, to place all your UI components in the place they belong by the rules of material design documentation.\n" +
                    "\n" +
                    "To-Do app on which we are going to work on will have an animated Splash Screen, as some other components in our app. Also an Animated Swipe to Delete functionality which will allow us to easily remove an item from the list. Along with that we will add a safety feature called UNDO deleted item, which will display a SnackBar whenever we delete an item from the list, so we can get it back by one click. You will learn planty of other things related to the new way of developing Android Apps.\n" +
                    "\n" +
                    "And finally this course will be constantly updated with new videos whenever needed. Whenever we find a bug in our app, then I'm going to record a video about it and we are going to fix it together. Plus you'll be in contact with me throughout this whole course, and you can always ask me a question related to this course and even suggest some code cleanup for the project if  you are skilled enough to find it.",
            isFree = false,
            price = "700k",
            banner = "https://celvine.sirv.com/esail/50af8cfcb065f268b328e135b92fa2d9.webp",
            rating = "4.5 (399)",
            Captain = CaptainModel(
                Name = "Stefan Jovanovic",
                Job = "Android Developer/Designer",
                Image = "https://img-c.udemycdn.com/user/200_H/34894726_5662_3.jpg"
            ),
            category = "Development",
            isPopular = false,
            isFlashSale = true,
            totalTime = "9h 16m",
            totalVideo = 62
        ),
    )
}