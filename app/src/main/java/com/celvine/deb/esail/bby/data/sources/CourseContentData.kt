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
        )
    )
}
