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
        )
    )
}
