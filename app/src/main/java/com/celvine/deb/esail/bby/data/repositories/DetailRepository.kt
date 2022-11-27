package com.celvine.deb.esail.bby.data.repositories

import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.data.sources.CourseData

class DetailRepository {
    fun getById(id: Int): CourseModel {
        return CourseData.data.first {
            it.id == id
        }
    }

    companion object {
        @Volatile
        private var instance: DetailRepository? = null;

        fun getInstance(): DetailRepository = instance ?: synchronized(this) {
            DetailRepository().apply {
                instance = this
            }
        }
    }
}