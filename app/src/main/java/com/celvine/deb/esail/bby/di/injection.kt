package com.celvine.deb.esail.bby.di

import com.celvine.deb.esail.bby.data.repositories.CoursesRepository

object Injection {
    fun provideCourseRepository(): CoursesRepository {
        return CoursesRepository.getInstance()
    }
}