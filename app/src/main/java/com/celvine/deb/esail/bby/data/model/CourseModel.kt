package com.celvine.deb.esail.bby.data.model

data class CourseModel(
    val id: Int,
    val title: String,
    val sortDesc: String,
    val desc: String,
    val isFree: Boolean = false,
    val price: String = "0",
    val banner: String,
    val rating: String,
    val mentor: String,
    val category: String,
    val isFlashSale: Boolean = false,
    val isPopular: Boolean = false
)
