package com.celvine.deb.esail.bby.data.sources

import com.celvine.deb.esail.bby.data.model.ContentModel
import com.celvine.deb.esail.bby.data.model.SectionModel

object CourseContentData {
    val data = listOf(
        ContentModel(
            Id = 1,
            CourseId = 1,
            Title = "Getting Started",
            TotalTime = "1h 10m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "02:32", Title = "Welcome to course"),
                SectionModel(Id = 2, Time = "04:42", Title = "What is Docker"),
                SectionModel(Id = 3, Time = "05:59", Title = "Why Docker & Containers"),
                SectionModel(
                    Id = 4,
                    Time = "08:55",
                    Title = "Virtual Machines vs Docker Container"
                ),
                SectionModel(Id = 5, Time = "04:31", Title = "Docker Setup - Overview"),
                SectionModel(Id = 6, Time = "03:33", Title = "Docker Setup - MacOs"),
                SectionModel(Id = 7, Time = "09:44", Title = "Docker Setup - Windows"),
                SectionModel(
                    Id = 8,
                    Time = "06:51",
                    Title = "Docker Setup - Docker Toolbox for older systems"
                ),
            )
        ),
        ContentModel(
            Id = 2,
            CourseId = 1,
            Title = "Docker Images & Containers",
            TotalTime = "2h 17m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "01:16", Title = "Module Introduction"),
                SectionModel(Id = 2, Time = "08:28", Title = "Images & Containers: What and why ?"),
                SectionModel(Id = 3, Time = "06:40", Title = "Using & Running External Images"),
                SectionModel(
                    Id = 4,
                    Time = "11:14",
                    Title = "Building our own image with a DockerFile"
                ),
                SectionModel(
                    Id = 5,
                    Time = "07:58",
                    Title = "Running a container based on our own image"
                ),
            )
        ),
        ContentModel(
            Id = 3,
            CourseId = 1,
            Title = "Managing Data & Working with volumes",
            TotalTime = "1h 57m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "01:27", Title = "Module Introduction"),
                SectionModel(
                    Id = 2,
                    Time = "03:28",
                    Title = "Understanding data categories / Different kinds of data"
                ),
                SectionModel(Id = 3, Time = "08:36", Title = "Analyzing a real app"),
                SectionModel(
                    Id = 4,
                    Time = "05:25",
                    Title = "Building & Understanding the demo app"
                ),
                SectionModel(
                    Id = 5,
                    Time = "02:57",
                    Title = "Understanding the problem"
                ),
                SectionModel(
                    Id = 6,
                    Time = "07:46",
                    Title = "A fist, unsuccessfully try"
                ),
            )
        ),
        ContentModel(
            Id = 4,
            CourseId = 2,
            Title = "Go-Lang Dasar",
            TotalTime = "7h 35m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "08:17", Title = "Pengenalan golang"),
                SectionModel(
                    Id = 2,
                    Time = "09:14",
                    Title = "Program Hello World"
                ),
                SectionModel(Id = 3, Time = "07:59", Title = "Tipe Data Number"),
                SectionModel(
                    Id = 4,
                    Time = "02:35",
                    Title = "Tipe Data Boolean"
                ),
                SectionModel(
                    Id = 5,
                    Time = "12:45",
                    Title = "Variable"
                ),
                SectionModel(
                    Id = 6,
                    Time = "05:35",
                    Title = "Constant"
                ),
                SectionModel(
                    Id = 7,
                    Time = "06:21",
                    Title = "Konversi Tipe Data"
                ),
            )
        ),
        ContentModel(
            Id = 5,
            CourseId = 2,
            Title = "Go-Lang Modules",
            TotalTime = "4h 20m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "02:04", Title = "Pendahuluan"),
                SectionModel(
                    Id = 2,
                    Time = "04:01",
                    Title = "Pengenalan Go Modules"
                ),
                SectionModel(Id = 3, Time = "08:31", Title = "Membuat Module"),
                SectionModel(
                    Id = 4,
                    Time = "04:00",
                    Title = "Menambah Dependency"
                ),
                SectionModel(
                    Id = 5,
                    Time = "02:35",
                    Title = "Upgrade Module"
                ),
                SectionModel(
                    Id = 6,
                    Time = "04:36",
                    Title = "Upgrade Dependency"
                ),
                SectionModel(
                    Id = 7,
                    Time = "01:39",
                    Title = "Materia Selanjutnya"
                ),
            )
        ),
        ContentModel(
            Id = 6,
            CourseId = 3,
            Title = "Introduction with jetpack compose",
            TotalTime = "43m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "03:47", Title = "Introduction"),
                SectionModel(
                    Id = 2,
                    Time = "04:01",
                    Title = "About Jetpack Compose"
                ),
                SectionModel(Id = 3, Time = "07:59", Title = "About Recompositing"),
                SectionModel(
                    Id = 4,
                    Time = "07:23",
                    Title = "State in jetpack compose"
                ),
                SectionModel(
                    Id = 5,
                    Time = "06:37",
                    Title = "Compose Lifecycle"
                ),
                SectionModel(
                    Id = 6,
                    Time = "04:55",
                    Title = "Side Effects"
                ),
                SectionModel(
                    Id = 7,
                    Time = "06:10",
                    Title = "Layouts"
                ),
            )
        ),
        ContentModel(
            Id = 7,
            CourseId = 3,
            Title = "Let's Build An App",
            TotalTime = "7h 33m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "09:39", Title = "Create New Project"),
                SectionModel(
                    Id = 2,
                    Time = "03:00",
                    Title = "Add Dependencies"
                ),
                SectionModel(Id = 3, Time = "05:51", Title = "Create Model Classes"),
                SectionModel(
                    Id = 4,
                    Time = "14:58",
                    Title = "Setup ROOM Database"
                ),
            )
        ),
        ContentModel(
            Id = 8,
            CourseId = 3,
            Title = "Final Word",
            TotalTime = "4m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "04:00", Title = "Final Word"),
            )
        ),
        ContentModel(
            Id = 9,
            CourseId = 4,
            Title = "Persiapan Belajar",
            TotalTime = "65m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "05:00", Title = "Persetujuan Hak Cipta"),
                SectionModel(Id = 2, Time = "05:00", Title = "Pendahuluan"),
                SectionModel(Id = 3, Time = "05:00", Title = "Prasyarat Kelas"),
                SectionModel(Id = 4, Time = "05:00", Title = "Materi Android Developer Expert"),
                SectionModel(Id = 5, Time = "10:00", Title = "Mekanisme Belajar"),
                SectionModel(Id = 6, Time = "05:00", Title = "Forum Diskusi"),
                SectionModel(Id = 7, Time = "05:00", Title = "Glasarium"),
                SectionModel(Id = 8, Time = "05:00", Title = "Daftar Referensi"),
            )
        ),
        ContentModel(
            Id = 10,
            CourseId = 4,
            Title = "Clean Architecture",
            TotalTime = "480m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "10:00", Title = "Pengenalan Clean Architecture"),
                SectionModel(Id = 2, Time = "10:00", Title = "Teori Design Pattern"),
                SectionModel(Id = 3, Time = "40:00", Title = "Creational Pattern"),
                SectionModel(Id = 4, Time = "20:00", Title = "Structural Pattern"),
                SectionModel(Id = 5, Time = "20:00", Title = "Behavioral Pattern"),
                SectionModel(Id = 6, Time = "05:00", Title = "Knowledge Check Design Pattern"),
                SectionModel(Id = 7, Time = "25:00", Title = "Teori Architectural Pattern"),
                SectionModel(Id = 8, Time = "30:00", Title = "Teori Clean Architecture"),
                SectionModel(Id = 9, Time = "90:00", Title = "Latihan Clean Architecture"),
                SectionModel(Id = 10, Time = "35:00", Title = "Starter Project Aplikasi"),
            )
        ),
        ContentModel(
            Id = 11,
            CourseId = 4,
            Title = "Reactive Programming",
            TotalTime = "570m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "40:00", Title = "Pengenalan Reactive Programming"),
                SectionModel(
                    Id = 2,
                    Time = "05:00",
                    Title = "Knowledge Check Reactive Programming"
                ),
                SectionModel(Id = 3, Time = "40:00", Title = "Creational Pattern"),
                SectionModel(Id = 4, Time = "15:00", Title = "Library Reactive di Android"),
            )
        ),
        ContentModel(
            Id = 12,
            CourseId = 5,
            Title = "Introduction",
            TotalTime = "9m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "03:00", Title = "Grid Introduction"),
                SectionModel(Id = 2, Time = "03:00", Title = "Seberapa penting grid pada project")
            )
        ),
        ContentModel(
            Id = 13,
            CourseId = 5,
            Title = "Implementasi Grid Design",
            TotalTime = "12m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "03:00", Title = "Getting Started Figma"),
                SectionModel(Id = 2, Time = "03:00", Title = "Setting Grid pada Figma"),
                SectionModel(Id = 3, Time = "03:00", Title = "UI Design Practice Part 1"),
                SectionModel(Id = 4, Time = "03:00", Title = "UI Design Practice Part 2"),
            )
        ),
        ContentModel(
            Id = 14,
            CourseId = 5,
            Title = "Outro Kelas Grid with Figma",
            TotalTime = "3m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "03:00", Title = "Kesimpulan"),
            )
        ),
        ContentModel(
            Id = 15,
            CourseId = 6,
            Title = "Pengenalan",
            TotalTime = "60m 12d",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "03:00", Title = "Demo Project"),
                SectionModel(Id = 2, Time = "60:12", Title = "Planing"),
            )
        ),
        ContentModel(
            Id = 16,
            CourseId = 6,
            Title = "Persiapan",
            TotalTime = "2h 19m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "03:00", Title = "Setup"),
                SectionModel(Id = 2, Time = "11:10", Title = "Login & Register"),
            )
        ),
        ContentModel(
            Id = 17,
            CourseId = 6,
            Title = "Executing",
            TotalTime = "3h 10m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "180:10", Title = "Slicing kerangka kerja"),
            )
        ),
        ContentModel(
            Id = 18,
            CourseId = 7,
            Title = "Introduction & Setup",
            TotalTime = "3h 10m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "01:48", Title = "Introduction blander"),
                SectionModel(Id = 2, Time = "06:53", Title = "Moving arround the scene"),
                SectionModel(Id = 3, Time = "10:54", Title = "Adding Objects"),
                SectionModel(Id = 4, Time = "11:25", Title = "Viewport & Rendering"),
            )
        ),
        ContentModel(
            Id = 19,
            CourseId = 7,
            Title = "Modular Dungeon",
            TotalTime = "2h 31m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "01:29", Title = "Introduction Modular Dungeon"),
                SectionModel(Id = 2, Time = "09:49", Title = "Creating A Barrel"),
                SectionModel(Id = 3, Time = "09:34", Title = "Creating A Crate"),
                SectionModel(Id = 4, Time = "11:30", Title = "Creating A Pillar"),
                SectionModel(Id = 5, Time = "09.38", Title = "Pillar Details"),
                SectionModel(Id = 6, Time = "06:28", Title = "Adding Materials"),
            )
        ),
        ContentModel(
            Id = 20,
            CourseId = 8,
            Title = "Introduction Class",
            TotalTime = "2m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "01:00", Title = "Introduction Class"),
                SectionModel(Id = 2, Time = "01:00", Title = "What's Photoshop"),
            )
        ),
        ContentModel(
            Id = 21,
            CourseId = 8,
            Title = "Basic Photoshop",
            TotalTime = "1h 20m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "10:19", Title = "Masking, Clipping, and tracing"),
                SectionModel(Id = 2, Time = "13:13", Title = "Colour grading and sharpening"),
                SectionModel(Id = 3, Time = "14:32", Title = "Brand mockup and manipulation"),
                SectionModel(Id = 4, Time = "08:57", Title = "Adding logo designs to mockups"),
                SectionModel(Id = 5, Time = "09:58", Title = "Adding details into a poster design"),
                SectionModel(Id = 6, Time = "03:46", Title = "Adding depth to brand mockups"),
            )
        ),
        ContentModel(
            Id = 22,
            CourseId = 9,
            Title = "Introduction Class",
            TotalTime = "19m 41d",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "01:00", Title = "Introduction React"),
            )
        ),
        ContentModel(
            Id = 23,
            CourseId = 9,
            Title = "Introduction React Js",
            TotalTime = "19m 41d",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "10:10", Title = "Component based design"),
                SectionModel(Id = 2, Time = "09:10", Title = "Create react app"),
                SectionModel(Id = 3, Time = "08:00", Title = "vs code extensions"),
                SectionModel(Id = 4, Time = "12:23", Title = "What is JSX"),
                SectionModel(Id = 5, Time = "05:31", Title = "BEM Naming Convension"),
                SectionModel(Id = 6, Time = "09:56", Title = "Class based vs functional based components"),
            )
        ),
        ContentModel(
            Id = 23,
            CourseId = 10,
            Title = "Introduction Class",
            TotalTime = "1m 41d",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "10:10", Title = "Component based design"),
            )
        ),
        ContentModel(
            Id = 24,
            CourseId = 10,
            Title = "Introduction Adobe Illustrator",
            TotalTime = "1m 41d",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "03:03", Title = "What is adobe illustrator"),
                SectionModel(Id = 2, Time = "13:41", Title = "My personal layout workspace"),
                SectionModel(Id = 3, Time = "07:13", Title = "My top plugins"),
                SectionModel(Id = 4, Time = "07:01", Title = "5 Commond shortcuts"),
                SectionModel(Id = 5, Time = "02:21", Title = "Custom keyboard shortcuts"),
            )
        ),
        ContentModel(
            Id = 24,
            CourseId = 11,
            Title = "Basics",
            TotalTime = "51m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "10:10", Title = "Setup and hello world"),
                SectionModel(Id = 2, Time = "10:10", Title = "primitive types"),
                SectionModel(Id = 3, Time = "10:10", Title = "Instance types"),
                SectionModel(Id = 4, Time = "10:10", Title = "Array and Tupples"),
            )
        ),
        ContentModel(
            Id = 25,
            CourseId = 11,
            Title = "Intermediate",
            TotalTime = "47m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "02:34", Title = "Lexical this"),
                SectionModel(Id = 2, Time = "01:59", Title = "readonly modifier"),
                SectionModel(Id = 3, Time = "02:57", Title = "Union Types"),
                SectionModel(Id = 4, Time = "02:58", Title = "Type Narrowing"),
            )
        ),
        ContentModel(
            Id = 26,
            CourseId = 11,
            Title = "Advanced",
            TotalTime = "36m",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "01:25", Title = "implements keyword"),
                SectionModel(Id = 2, Time = "02:31", Title = "Definite Assignment Assertion"),
                SectionModel(Id = 3, Time = "02:02", Title = "User Defined Type Guards"),
            )
        ),
    )
}
