package com.celvine.deb.esail.bby.data.repositories

import com.celvine.deb.esail.bby.data.model.CartModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class CartRepository {
    private val cartList = mutableListOf<CartModel>()

    fun getAddedCartlist(): Flow<List<CartModel>> {
        return flowOf(cartList)
    }

    fun addToCart(id: Int): Flow<Boolean> {
        cartList.add(cartList.size, CartModel(id))

        return flowOf(true)
    }

    fun removeFromCartList(id: Int): Flow<Boolean> {
        val index = cartList.indexOfFirst { it.Id == id }

        cartList.removeAt(index)

        return flowOf(true)
    }

    fun isAdded(id: Int): Boolean {
        val result = cartList.indexOfFirst { it.Id == id }

        return result >= 0
    }

    companion object {
        @Volatile
        private var instance: CartRepository? = null

        fun getInstance(): CartRepository =
            instance ?: synchronized(this) {
                CartRepository().apply {
                    instance = this
                }
            }
    }
}