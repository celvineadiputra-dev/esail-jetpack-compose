package com.celvine.deb.esail.bby.models

data class CourseModel(
    val id: Int,
    val title: String,
    val sortDesc: String,
    val desc: String,
    val isFree: Boolean = false,
    val price: String = "0",
    val banner: String,
    val rating : String
)
