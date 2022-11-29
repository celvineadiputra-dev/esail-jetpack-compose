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
            price = 129000,
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
            price = 340000,
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
            price = 700000,
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
        CourseModel(
            id = 4,
            title = "Menjadi Android Developer Expert",
            sortDesc = "Saatnya menjadi Android Expert dengan belajar Clean Architecture, Reactive, Dependency Injection, Modularization, Performance, dan Security.",
            desc = "Perusahaan berlomba membuat aplikasi Android agar dapat menjangkau pasar. Namun kesuksesan sebuah aplikasi terbentur kompetisi dan mahalnya biaya akuisisi user. Maka diperlukan aplikasi dengan performa tinggi supaya dapat bersaing dan tidak dihapus oleh user. Minimnya bug, keamanan, dan ukuran aplikasi adalah faktor lain yang perlu diperhatikan untuk kenyamanan user. Maka, pelajarilah di kelas ini cara membuat kode yang mudah diubah untuk mengikuti kebutuhan bisnis dan tidak rapuh ketika dikembangkan. \n" +
                    "\n" +
                    "Permintaan tinggi dari perusahaan untuk developer Android dengan ilmu expert karena minimnya kualitas developer di Indonesia.\n" +
                    "Materi yang diajarkan di kelas ini merupakan best-practice langsung dari industri sehingga dipastikan berguna untuk kebutuhan sehari-hari.\n" +
                    "Kemudahan untuk menyesuaikan aplikasi Anda dengan kebutuhan perusahaan melalui arsitektur kuat yang mudah dipelihara.\n" +
                    "Beberapa keahlian sudah menjadi prasyarat minimal untuk kerja di perusahaan teknologi seperti Reactive Programming dan Dependency Injection.\n" +
                    "Performance dan Security adalah hal yang harus Anda perhatikan jika ingin membuat aplikasi yang dipakai jutaan user.",
            isFree = false,
            price = 1500000,
            banner = "https://celvine.sirv.com/esail/99c9da926ceea22a1240dc43f2a6e683.webp",
            rating = "4.8 (3432)",
            Captain = CaptainModel(
                Name = "Dicoding",
                Job = "Online Academy",
                Image = "https://dicoding-web-img.sgp1.cdn.digitaloceanspaces.com/original/commons/new-ui-logo.png"
            ),
            category = "Development",
            isPopular = true,
            isFlashSale = false,
            totalTime = "90h",
            totalVideo = 0
        ),
        CourseModel(
            id = 5,
            title = "UI Design : Grid System dengan Figma",
            sortDesc = "Pada kelas kali ini kita akan bahas tuntas tentang pengertian dan juga penggunaan grid system pada design website menggunakan software Figma.com",
            desc = "Dalam membangun sebuah website dengan design yang menarik dan juga professional maka peran grid system sangatlah penting untuk mencapai akan hal-hal tersebut. Grid system memiliki beberapa manfaat yang salah satunya adalah untuk mempermudah proses kerja sama antara designer dan juga developer.\n" +
                    "\n" +
                    "Pada kelas kali ini kita akan bahas tuntas tentang pengertian dan juga penggunaan grid system pada design website menggunakan software Figma.com\n" +
                    "\n" +
                    "Kelas ini sangat cocok sekali apabila saat ini kita masih di tahap pemula, karena jika tidak kita pelajari sedari sekarang maka khawatir kedepannya hasil design kita tidak dapat diimplementasikan oleh developer dan ditolak oleh klien. Silakan bergabung dan kami akan tunggu di kelas.",
            isFree = true,
            price = 0,
            banner = "https://buildwithangga.com/storage/assets/thumbnails/Thumbnail%20Kelas%20Grid.jpg",
            rating = "4.8 (3432)",
            Captain = CaptainModel(
                Name = "BuildWithAngga",
                Job = "Online Academy",
                Image = "https://celvine.sirv.com/esail/logo_bwa_new.webp"
            ),
            category = "Design",
            isPopular = false,
            isFlashSale = false,
            totalTime = "24m",
            totalVideo = 8
        ),
        CourseModel(
            id = 6,
            title = "Flutter Mobile Development: Food Shop App",
            sortDesc = "Mempelajari penerapan slicing UI design dan integrasi data dengan API",
            desc = "Mengimplementasikan fitur E-Commerce untuk Food Shop App seperti fitur transaksi online menggunakan techstack Flutter, PHP, serta MySQL. Mempelajari penerapan slicing UI design dan integrasi data dengan API.",
            isFree = false,
            price = 700000,
            banner = "https://celvine.sirv.com/esail/202208101249-Thumbnail%20Flutter%20Mobile%20Development%20Food%20Shop%20App-min.png",
            rating = "4.8 (120)",
            Captain = CaptainModel(
                Name = "BuildWithAngga",
                Job = "Online Academy",
                Image = "https://celvine.sirv.com/esail/logo_bwa_new.webp"
            ),
            category = "Development",
            isPopular = false,
            isFlashSale = true,
            totalTime = "230h 10m",
            totalVideo = 15
        ),
        CourseModel(
            id = 7,
            title = "Complete Blender Creator: Learn 3D Modelling for Beginners",
            sortDesc = "Use Blender to Create Beautiful 3D models for Video Games, 3D Printing & More. Beginners Level Course",
            desc = "This course is in the process of being completely remastered in Blender 3.2. Currently both the new and original content are in this course, once the remaster is complete students will be able to access the original 2.8 content in a separate archive course.\n" +
                    "\n" +
                    "Blender is a fantastic platform which enables you to make AAA-quality models which can be exported to any game engine, 3D printer, or other software. Here are some of the reasons why you want to learn Blender with this online tutorial...\n" +
                    "\n" +
                    "Create assets for video games.\n" +
                    "\n" +
                    "Make unique 3D printed gifts.\n" +
                    "\n" +
                    "Design your dream house, car, etc\n" +
                    "\n" +
                    "Express yourself through 3D artwork.\n" +
                    "\n" +
                    "Learn how to create 3D Models and Assets for games using Blender, the free-to-use 3D production suite. We start super simple so you'll be ok with little or no experience. With our online tutorials, you'll be amazed what you can achieve.\n" +
                    "\n" +
                    "The GameDevtv team has created some of the world's most popular online game development training courses. This Blender course has been enjoyed by hundreds of thousands of students and, with more than 30,000 5 star reviews, is consistently ranked the #1 Blender course on Udemy in terms of rating and popularity. \n" +
                    "\n" +
                    "The course is project-based, so you will applying your new skills immediately to real 3D models. All the project files will be included, as well as additional references and resources - you'll never get stuck. There are talking-head videos, powerful diagrams, quality screencasts and more.\n" +
                    "\n" +
                    "For each of the models that you build you will follow this process... \n" +
                    "\n" +
                    "Be challenged to build the entire model yourself.\n" +
                    "\n" +
                    "Be shown step-by-step how to build it.\n" +
                    "\n" +
                    "Apply your knowledge regularly.\n" +
                    "\n" +
                    "Have a more specific focus? Check out our other Blender courses which focus on characters and environments. Want to bring your models to life in a video game engine? Check out our Complete Unity Developer 3D course. Just look for our green leaf logo - a sign of passion & quality.\n" +
                    "\n" +
                    "You will get full lifetime access for a single one-off fee. The creators are qualified and experienced with modelling and coding, so are able to explain complex concepts clearly, as well as entertain along the way. By the end of the course, you'll be very confident in the basics of 3D modelling and rendering, and hungry to learn more.\n" +
                    "\n" +
                    "If you're a complete beginner, we'll teach you all the modelling fundamentals you'll need. If you're an artist, we'll teach you to bring your assets to life. If you're a coder, we'll teach you modelling and design principles.\n" +
                    "\n" +
                    "Get plugged into our communities of amazing developers on Facebook (around 20k), in our own Community curated by our supportive and knowledgeable Teaching Assistants (17k views/day), and our student Discord chat group (10k live at any one time).\n" +
                    "\n" +
                    "Dive in now, you won't be disappointed!",
            isFree = false,
            price = 99000,
            banner = "https://celvine.sirv.com/esail/7ce0a110dcdffe4758c2b7677b398dfa38db62ac%20(Medium).jpeg",
            rating = "4.8 (120)",
            Captain = CaptainModel(
                Name = "Rick Davidson",
                Job = "Helped More Than 1 Million Students",
                Image = "https://img-b.udemycdn.com/user/200_H/24317920_c8a2_2.jpg"
            ),
            category = "Design",
            isPopular = false,
            isFlashSale = true,
            totalTime = "13h",
            totalVideo = 101
        ),
        CourseModel(
            id = 8,
            title = "Photoshop Masterclass for Graphic Designers",
            sortDesc = "Do you want to translate your imagination into a reality? Anything is possible with Photoshop. It allows you to create any ideas into a beautiful piece of art or creative design",
            desc = "Do you want to translate your imagination into a reality? Anything is possible with Photoshop. It allows you to create any ideas into a beautiful piece of art or creative design. In this class, I show you how to use Adobe Photoshop like a pro sharing all my shortcuts, principles and techniques I use on a regular basis.\n" +
                    "\n" +
                    "\n" +
                    "You’ll learn:\n" +
                    "\n" +
                    "Masks, Adjustments, Layers\n" +
                    "My personal time-saving shortcuts\n" +
                    "Image manipulation and realism\n" +
                    "Creating realistic mock ups and images\n" +
                    "How to add extra details to any design\n" +
                    "How to use the filter gallery\n" +
                    "Sharpening and colour grading\n" +
                    "Improving your mock up presentation\n" +
                    "Creating your own textures\n" +
                    "Neural Filters and Filter Gallery",
            isFree = true,
            price = 0,
            banner = "https://celvine.sirv.com/esail/1740903%20(Medium).jpg",
            rating = "4.4 (801)",
            Captain = CaptainModel(
                Name = "Jeremy Mura",
                Job = "Graphic & Brand Designer, Youtuber",
                Image = "https://static.skillshare.com/uploads/users/9601283/user-image-medium.jpg?96701960"
            ),
            category = "Design",
            isPopular = true,
            isFlashSale = false,
            totalTime = "1h 22m",
            totalVideo = 11
        ),
        CourseModel(
            id = 9,
            title = "The Complete React Basics 101 Course for Beginners",
            sortDesc = "I will teach all the important aspects to getting started with React in detail and I promise you that you will learn something whether you're an absolute beginner or an advanced React developer!",
            desc = "The React Basics 101 Class will help you get started with React.\n" +
                    "\n" +
                    "I will teach all the important aspects to getting started with React in detail and I promise you that you will learn something whether you're an absolute beginner or an advanced React developer!\n" +
                    "\n" +
                    "I will guide you on a path to make amazing clones such as the Facebook, Snapchat, WhatsApp clones just like the ones on my YouTube channel (Sonny Sangha)\n" +
                    "\n" +
                    "These clones can greatly spice up your digital portfolio which will in turn help you land your dream job as a React Developer!\n" +
                    "\n",
            isFree = false,
            price = 75000,
            banner = "https://celvine.sirv.com/esail/React%20Native%20vs%20Reactjs.png",
            rating = "4.7 (3020)",
            Captain = CaptainModel(
                Name = "Sonny Sangha",
                Job = "React Full Stack Dev + YouTuber",
                Image = "https://static.skillshare.com/uploads/users/576524223/user-image-medium.jpg?724172393"
            ),
            category = "Development",
            isPopular = false,
            isFlashSale = true,
            totalTime = "3h 20m",
            totalVideo = 14
        ),
    )
}