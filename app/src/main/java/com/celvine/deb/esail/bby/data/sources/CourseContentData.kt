package com.celvine.deb.esail.bby.data.sources

import com.celvine.deb.esail.bby.data.model.ContentModel
import com.celvine.deb.esail.bby.data.model.SectionModel

object CourseContentData {
    val data = listOf(
        ContentModel(
            Id = 1,
            CourseId = 1,
            Title = "Getting Started",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "0h", Title = "X"),
                SectionModel(Id = 2, Time = "0h", Title = "Y")
            )
        ),
        ContentModel(
            Id = 2,
            CourseId = 1,
            Title = "2 Getting Started",
            Sections = listOf<SectionModel>(
                SectionModel(Id = 1, Time = "0h", Title = "X"),
                SectionModel(Id = 2, Time = "0h", Title = "Y")
            )
        )
    )
}
