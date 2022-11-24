package com.celvine.deb.esail.bby.data.repositories

import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.data.sources.CourseData

class CoursesRepository {
    fun getCourses(): List<CourseModel> {
        return CourseData.data
    }

    fun searchCourse(query: String): List<CourseModel> {
        return CourseData.data.filter { it.title.contains(query, ignoreCase = true) }
    }
}