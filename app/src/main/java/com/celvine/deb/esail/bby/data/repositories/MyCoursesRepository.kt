package com.celvine.deb.esail.bby.data.repositories

import com.celvine.deb.esail.bby.data.model.MyCoursesModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class MyCoursesRepository {
    private val mycourse = mutableListOf<MyCoursesModel>()

    fun getMyCourses(): Flow<List<MyCoursesModel>> {
        return flowOf(mycourse)
    }

    fun enroll(id: Int): Flow<Boolean> {
        mycourse.add(mycourse.size, MyCoursesModel(id))

        return flowOf(true)
    }

    companion object {
        @Volatile
        private var instance: MyCoursesRepository? = null

        fun getInstance(): MyCoursesRepository = instance ?: synchronized(this) {
            MyCoursesRepository().apply {
                instance = this
            }
        }
    }
}