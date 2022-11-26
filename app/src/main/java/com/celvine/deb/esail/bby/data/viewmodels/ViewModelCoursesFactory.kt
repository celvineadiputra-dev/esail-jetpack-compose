package com.celvine.deb.esail.bby.data.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.celvine.deb.esail.bby.data.repositories.CoursesRepository

class ViewModelCoursesFactory(private val repository: CoursesRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CoursesViewModel::class.java)) {
            return CoursesViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(PopularCourseViewModel::class.java)) {
            return PopularCourseViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(FlashSaleCoursesViewModel::class.java)) {
            return FlashSaleCoursesViewModel(repository) as T
        }
        throw  java.lang.IllegalArgumentException("Unknown View Model")
    }
}