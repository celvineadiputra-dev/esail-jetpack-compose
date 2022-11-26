package com.celvine.deb.esail.bby.data.model

data class ContentModel(
    val Id: Int,
    val CourseId: Int,
    val Title: String,
    val Sections: List<SectionModel>
)
