package com.celvine.deb.esail.bby.data.model

data class CourseModel(
    val id: Int,
    val title: String,
    val sortDesc: String,
    val desc: String,
    val isFree: Boolean = false,
    val price: Int = 0,
    val banner: String,
    val rating: String,
    val category: String,
    val isFlashSale: Boolean = false,
    val isPopular: Boolean = false,
    val Captain: CaptainModel,
    val totalVideo: Int,
    val totalTime: String,
)
