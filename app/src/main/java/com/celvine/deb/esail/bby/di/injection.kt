package com.celvine.deb.esail.bby.di

import com.celvine.deb.esail.bby.data.repositories.*

object Injection {
    fun provideCourseRepository(): CoursesRepository {
        return CoursesRepository.getInstance()
    }

    fun provideContentRepository(): ContentRepository {
        return ContentRepository.getInstance()
    }

    fun provideWishlistRepository(): WishlistRepository {
        return WishlistRepository.getInstance()
    }

    fun provideDetailRepository(): DetailRepository {
        return DetailRepository.getInstance()
    }

    fun provideCartRepository(): CartRepository {
        return CartRepository.getInstance()
    }
}