package com.celvine.deb.esail.bby.data.repositories

import com.celvine.deb.esail.bby.data.model.WishlistModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class WishlistRepository {
    private val wishlist = mutableListOf<WishlistModel>()

    fun getAddedWishlist(): Flow<List<WishlistModel>> {
        return flowOf(wishlist)
    }

    fun addToWishlist(id: Int): Flow<Boolean> {
        wishlist.add(wishlist.size, WishlistModel(id))

        return flowOf(true)
    }

    companion object {
        @Volatile
        private var instance: WishlistRepository? = null

        fun getInstance(): WishlistRepository =
            instance ?: synchronized(this) {
                WishlistRepository().apply {
                    instance = this
                }
            }
    }
}