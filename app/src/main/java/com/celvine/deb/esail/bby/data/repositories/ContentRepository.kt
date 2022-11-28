package com.celvine.deb.esail.bby.data.repositories

import com.celvine.deb.esail.bby.data.model.ContentModel
import com.celvine.deb.esail.bby.data.sources.CourseContentData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map

class ContentRepository {
    fun getContent(id: Int): Flow<List<ContentModel>> {
        return flowOf(CourseContentData.data).map { item -> item.filter { it.CourseId == id } }
    }

    companion object {
        @Volatile
        private var instance: ContentRepository? = null

        fun getInstance(): ContentRepository = instance ?: synchronized(this) {
            ContentRepository().apply {
                instance = this
            }
        }
    }
}