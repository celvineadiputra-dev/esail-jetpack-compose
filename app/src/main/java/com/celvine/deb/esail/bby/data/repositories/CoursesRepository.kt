package com.celvine.deb.esail.bby.data.repositories

import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.data.sources.CourseData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map

class CoursesRepository {
    fun getCourses(): Flow<List<CourseModel>> {
        return flowOf(CourseData.data)
    }

    fun searchCourse(query: String): Flow<List<CourseModel>> {
        return flowOf(CourseData.data).map { item ->
            item.filter {
                it.title.contains(
                    query,
                    ignoreCase = true
                )
            }
        }
    }

    fun getPopular(): Flow<List<CourseModel>> {
        return flowOf(CourseData.data).map { item -> item.filter { it.isPopular } }
    }

    fun getFlashSale(): Flow<List<CourseModel>> {
        return flowOf(CourseData.data).map { item -> item.filter { it.isFlashSale } }
    }

    fun getById(id: Int): Flow<List<CourseModel>> {
        return flowOf(CourseData.data).map { item -> item.filter { it.id == id } }
    }

    companion object {
        @Volatile
        private var instance: CoursesRepository? = null;

        fun getInstance(): CoursesRepository = instance ?: synchronized(this) {
            CoursesRepository().apply {
                instance = this
            }
        }
    }
}