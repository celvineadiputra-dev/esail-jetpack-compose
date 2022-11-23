package com.celvine.deb.esail.bby.data

import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.models.CategoryCourseModel
import com.celvine.deb.esail.bby.ui.theme.*

object CategoryCourseData {
    val data = listOf<CategoryCourseModel>(
        CategoryCourseModel(1, R.drawable.pen_icon, "Design", DodgerBlue),
        CategoryCourseModel(2, R.drawable.dev_icon, "Development", Ruby),
        CategoryCourseModel(3, R.drawable.earth_icon, "Language", Green),
        CategoryCourseModel(4, R.drawable.sound_icon, "Music", MaximumYellowRed),
    )
}